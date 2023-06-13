package com.applemango.SteveJobda.db.generate.model;

import java.util.ArrayList;
import java.util.List;

public class AdminAuthExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    public AdminAuthExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andAdminAuthSnIsNull() {
            addCriterion("admin_auth_sn is null");
            return (Criteria) this;
        }

        public Criteria andAdminAuthSnIsNotNull() {
            addCriterion("admin_auth_sn is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAuthSnEqualTo(Integer value) {
            addCriterion("admin_auth_sn =", value, "adminAuthSn");
            return (Criteria) this;
        }

        public Criteria andAdminAuthSnNotEqualTo(Integer value) {
            addCriterion("admin_auth_sn <>", value, "adminAuthSn");
            return (Criteria) this;
        }

        public Criteria andAdminAuthSnGreaterThan(Integer value) {
            addCriterion("admin_auth_sn >", value, "adminAuthSn");
            return (Criteria) this;
        }

        public Criteria andAdminAuthSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_auth_sn >=", value, "adminAuthSn");
            return (Criteria) this;
        }

        public Criteria andAdminAuthSnLessThan(Integer value) {
            addCriterion("admin_auth_sn <", value, "adminAuthSn");
            return (Criteria) this;
        }

        public Criteria andAdminAuthSnLessThanOrEqualTo(Integer value) {
            addCriterion("admin_auth_sn <=", value, "adminAuthSn");
            return (Criteria) this;
        }

        public Criteria andAdminAuthSnIn(List<Integer> values) {
            addCriterion("admin_auth_sn in", values, "adminAuthSn");
            return (Criteria) this;
        }

        public Criteria andAdminAuthSnNotIn(List<Integer> values) {
            addCriterion("admin_auth_sn not in", values, "adminAuthSn");
            return (Criteria) this;
        }

        public Criteria andAdminAuthSnBetween(Integer value1, Integer value2) {
            addCriterion("admin_auth_sn between", value1, value2, "adminAuthSn");
            return (Criteria) this;
        }

        public Criteria andAdminAuthSnNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_auth_sn not between", value1, value2, "adminAuthSn");
            return (Criteria) this;
        }

        public Criteria andAdminSnIsNull() {
            addCriterion("admin_sn is null");
            return (Criteria) this;
        }

        public Criteria andAdminSnIsNotNull() {
            addCriterion("admin_sn is not null");
            return (Criteria) this;
        }

        public Criteria andAdminSnEqualTo(Integer value) {
            addCriterion("admin_sn =", value, "adminSn");
            return (Criteria) this;
        }

        public Criteria andAdminSnNotEqualTo(Integer value) {
            addCriterion("admin_sn <>", value, "adminSn");
            return (Criteria) this;
        }

        public Criteria andAdminSnGreaterThan(Integer value) {
            addCriterion("admin_sn >", value, "adminSn");
            return (Criteria) this;
        }

        public Criteria andAdminSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_sn >=", value, "adminSn");
            return (Criteria) this;
        }

        public Criteria andAdminSnLessThan(Integer value) {
            addCriterion("admin_sn <", value, "adminSn");
            return (Criteria) this;
        }

        public Criteria andAdminSnLessThanOrEqualTo(Integer value) {
            addCriterion("admin_sn <=", value, "adminSn");
            return (Criteria) this;
        }

        public Criteria andAdminSnIn(List<Integer> values) {
            addCriterion("admin_sn in", values, "adminSn");
            return (Criteria) this;
        }

        public Criteria andAdminSnNotIn(List<Integer> values) {
            addCriterion("admin_sn not in", values, "adminSn");
            return (Criteria) this;
        }

        public Criteria andAdminSnBetween(Integer value1, Integer value2) {
            addCriterion("admin_sn between", value1, value2, "adminSn");
            return (Criteria) this;
        }

        public Criteria andAdminSnNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_sn not between", value1, value2, "adminSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnIsNull() {
            addCriterion("auth_sn is null");
            return (Criteria) this;
        }

        public Criteria andAuthSnIsNotNull() {
            addCriterion("auth_sn is not null");
            return (Criteria) this;
        }

        public Criteria andAuthSnEqualTo(Integer value) {
            addCriterion("auth_sn =", value, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnNotEqualTo(Integer value) {
            addCriterion("auth_sn <>", value, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnGreaterThan(Integer value) {
            addCriterion("auth_sn >", value, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_sn >=", value, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnLessThan(Integer value) {
            addCriterion("auth_sn <", value, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnLessThanOrEqualTo(Integer value) {
            addCriterion("auth_sn <=", value, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnIn(List<Integer> values) {
            addCriterion("auth_sn in", values, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnNotIn(List<Integer> values) {
            addCriterion("auth_sn not in", values, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnBetween(Integer value1, Integer value2) {
            addCriterion("auth_sn between", value1, value2, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_sn not between", value1, value2, "authSn");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table admin_auth
     *
     * @mbg.generated do_not_delete_during_merge Tue Jun 13 08:52:40 KST 2023
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table admin_auth
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
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