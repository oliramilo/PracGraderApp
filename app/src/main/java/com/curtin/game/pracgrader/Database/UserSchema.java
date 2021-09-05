package com.curtin.game.pracgrader.Database;

public class UserSchema {

    public static class UserTable {
        public static final String NAME = "Users";
        public static String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " +
                NAME + "( " + Cols.USERNAME +
                " TEXT UNIQUE NOT NULL, " +
                Cols.PIN  + " INTEGER UNIQUE NOT NULL, " +
                Cols.TYPE + " TEXT, " +
                Cols.COUNTRY_CODE + " TEXT, " +
                Cols.PERMISSION + " TEXT NOT NULL " +
                "ON UPDATE CASCADE ON DELETE CASCADE" + ");";

        public static class Cols {
            public static final String USERNAME = "username";
            public static final String PIN = "pin";
            public static final String PERMISSION = "permission";
            public static final String COUNTRY_CODE = "country";
            public static final String TYPE = "type";
        }

        public static class UserType {
            public static final String ADMIN = "ADMIN";
            public static final String INSTRUCTOR = "INSTRUCTOR";
            public static final String STUDENT = "STUDENT";
        }
    }


}
