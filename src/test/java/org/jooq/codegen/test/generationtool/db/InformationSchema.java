/*
 * This file is generated by jOOQ.
 */
package org.jooq.codegen.test.generationtool.db;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.codegen.test.generationtool.db.tables.Tables;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InformationSchema extends SchemaImpl {

    private static final long serialVersionUID = -708910021;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA</code>
     */
    public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

    /**
     * The table <code>INFORMATION_SCHEMA.TABLES</code>.
     */
    public final Tables TABLES = org.jooq.codegen.test.generationtool.db.tables.Tables.TABLES;

    /**
     * No further instances allowed
     */
    private InformationSchema() {
        super("INFORMATION_SCHEMA", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Tables.TABLES);
    }
}