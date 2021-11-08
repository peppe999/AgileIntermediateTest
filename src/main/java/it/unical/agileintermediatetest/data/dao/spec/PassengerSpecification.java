package it.unical.agileintermediatetest.data.dao.spec;

import it.unical.agileintermediatetest.data.entities.Passenger;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class PassengerSpecification {
    public static class Filter {
        private Integer age;
        private String firstName;
        private String lastName;

        public Filter() {
        }

        public Filter(Integer age, String firstName, String lastName) {
            this.age = age;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Filter filter = (Filter) o;
            return age.equals(filter.age) && firstName.equals(filter.firstName) && lastName.equals(filter.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, firstName, lastName);
        }
    }

    public static Specification<Passenger> getSpecFilter(Filter f) {
        return (root, query, criteriaBuilder) -> {
            Predicate predicate = criteriaBuilder.isNotNull(root.get("id"));

            if(f.getAge() != null) {
                LocalDate date = LocalDate.now().minusYears(f.getAge());
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.greaterThanOrEqualTo(root.get("birthDate"), date));
            }

            if(f.getFirstName() != null)
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.like(root.get("personalData").get("firstName"), f.getFirstName()));

            if(f.getLastName() != null)
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.like(root.get("personalData").get("lastName"), f.getLastName()));

            return query.where(predicate).distinct(true).getRestriction();
        };
    }
}
