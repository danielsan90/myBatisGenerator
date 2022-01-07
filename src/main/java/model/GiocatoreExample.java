package main.java.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GiocatoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GiocatoreExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNomeIsNull() {
            addCriterion("nome is null");
            return (Criteria) this;
        }

        public Criteria andNomeIsNotNull() {
            addCriterion("nome is not null");
            return (Criteria) this;
        }

        public Criteria andNomeEqualTo(String value) {
            addCriterion("nome =", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeNotEqualTo(String value) {
            addCriterion("nome <>", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeGreaterThan(String value) {
            addCriterion("nome >", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeGreaterThanOrEqualTo(String value) {
            addCriterion("nome >=", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeLessThan(String value) {
            addCriterion("nome <", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeLessThanOrEqualTo(String value) {
            addCriterion("nome <=", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeLike(String value) {
            addCriterion("nome like", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeNotLike(String value) {
            addCriterion("nome not like", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeIn(List<String> values) {
            addCriterion("nome in", values, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeNotIn(List<String> values) {
            addCriterion("nome not in", values, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeBetween(String value1, String value2) {
            addCriterion("nome between", value1, value2, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeNotBetween(String value1, String value2) {
            addCriterion("nome not between", value1, value2, "nome");
            return (Criteria) this;
        }

        public Criteria andCognomeIsNull() {
            addCriterion("cognome is null");
            return (Criteria) this;
        }

        public Criteria andCognomeIsNotNull() {
            addCriterion("cognome is not null");
            return (Criteria) this;
        }

        public Criteria andCognomeEqualTo(String value) {
            addCriterion("cognome =", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeNotEqualTo(String value) {
            addCriterion("cognome <>", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeGreaterThan(String value) {
            addCriterion("cognome >", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeGreaterThanOrEqualTo(String value) {
            addCriterion("cognome >=", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeLessThan(String value) {
            addCriterion("cognome <", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeLessThanOrEqualTo(String value) {
            addCriterion("cognome <=", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeLike(String value) {
            addCriterion("cognome like", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeNotLike(String value) {
            addCriterion("cognome not like", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeIn(List<String> values) {
            addCriterion("cognome in", values, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeNotIn(List<String> values) {
            addCriterion("cognome not in", values, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeBetween(String value1, String value2) {
            addCriterion("cognome between", value1, value2, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeNotBetween(String value1, String value2) {
            addCriterion("cognome not between", value1, value2, "cognome");
            return (Criteria) this;
        }

        public Criteria andDataNascitaIsNull() {
            addCriterion("data_nascita is null");
            return (Criteria) this;
        }

        public Criteria andDataNascitaIsNotNull() {
            addCriterion("data_nascita is not null");
            return (Criteria) this;
        }

        public Criteria andDataNascitaEqualTo(Date value) {
            addCriterionForJDBCDate("data_nascita =", value, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaNotEqualTo(Date value) {
            addCriterionForJDBCDate("data_nascita <>", value, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaGreaterThan(Date value) {
            addCriterionForJDBCDate("data_nascita >", value, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_nascita >=", value, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaLessThan(Date value) {
            addCriterionForJDBCDate("data_nascita <", value, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_nascita <=", value, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaIn(List<Date> values) {
            addCriterionForJDBCDate("data_nascita in", values, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaNotIn(List<Date> values) {
            addCriterionForJDBCDate("data_nascita not in", values, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_nascita between", value1, value2, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_nascita not between", value1, value2, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andIdSquadraIsNull() {
            addCriterion("id_squadra is null");
            return (Criteria) this;
        }

        public Criteria andIdSquadraIsNotNull() {
            addCriterion("id_squadra is not null");
            return (Criteria) this;
        }

        public Criteria andIdSquadraEqualTo(Long value) {
            addCriterion("id_squadra =", value, "idSquadra");
            return (Criteria) this;
        }

        public Criteria andIdSquadraNotEqualTo(Long value) {
            addCriterion("id_squadra <>", value, "idSquadra");
            return (Criteria) this;
        }

        public Criteria andIdSquadraGreaterThan(Long value) {
            addCriterion("id_squadra >", value, "idSquadra");
            return (Criteria) this;
        }

        public Criteria andIdSquadraGreaterThanOrEqualTo(Long value) {
            addCriterion("id_squadra >=", value, "idSquadra");
            return (Criteria) this;
        }

        public Criteria andIdSquadraLessThan(Long value) {
            addCriterion("id_squadra <", value, "idSquadra");
            return (Criteria) this;
        }

        public Criteria andIdSquadraLessThanOrEqualTo(Long value) {
            addCriterion("id_squadra <=", value, "idSquadra");
            return (Criteria) this;
        }

        public Criteria andIdSquadraIn(List<Long> values) {
            addCriterion("id_squadra in", values, "idSquadra");
            return (Criteria) this;
        }

        public Criteria andIdSquadraNotIn(List<Long> values) {
            addCriterion("id_squadra not in", values, "idSquadra");
            return (Criteria) this;
        }

        public Criteria andIdSquadraBetween(Long value1, Long value2) {
            addCriterion("id_squadra between", value1, value2, "idSquadra");
            return (Criteria) this;
        }

        public Criteria andIdSquadraNotBetween(Long value1, Long value2) {
            addCriterion("id_squadra not between", value1, value2, "idSquadra");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}