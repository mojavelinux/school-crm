/*
 * This file is generated by jOOQ.
 */
package org.ort.school.crm.jooq.model.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.ort.school.crm.jooq.model.tables.ParentStudent;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ParentStudentRecord extends UpdatableRecordImpl<ParentStudentRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = 1319664981;

    /**
     * Setter for <code>public.parent_student.parent_id</code>.
     */
    public void setParentId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.parent_student.parent_id</code>.
     */
    public Long getParentId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.parent_student.student_id</code>.
     */
    public void setStudentId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.parent_student.student_id</code>.
     */
    public Long getStudentId() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ParentStudent.PARENT_STUDENT.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return ParentStudent.PARENT_STUDENT.STUDENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParentStudentRecord value1(Long value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParentStudentRecord value2(Long value) {
        setStudentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParentStudentRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ParentStudentRecord
     */
    public ParentStudentRecord() {
        super(ParentStudent.PARENT_STUDENT);
    }

    /**
     * Create a detached, initialised ParentStudentRecord
     */
    public ParentStudentRecord(Long parentId, Long studentId) {
        super(ParentStudent.PARENT_STUDENT);

        set(0, parentId);
        set(1, studentId);
    }
}
