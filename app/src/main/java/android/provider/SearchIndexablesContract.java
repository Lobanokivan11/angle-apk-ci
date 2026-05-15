package android.provider;

import android.content.ContentResolver;

public class SearchIndexablesContract {
    public static final String PROVIDER_INTERFACE = "android.content.action.SEARCH_INDEXABLES_PROVIDER";
    private static final String SETTINGS = "settings";
    public static final String INDEXABLES_XML_RES = "indexables_xml_res";
    public static final String INDEXABLES_RAW = "indexables_raw";
    public static final String NON_INDEXABLES_KEYS = "non_indexables_key";
    public static final String SITE_MAP_PAIRS_KEYS = "site_map_pairs";
    public static final String SLICE_URI_PAIRS = "slice_uri_pairs";
    public static final String DYNAMIC_INDEXABLES_RAW = "dynamic_indexables_raw";
    public static final String INDEXABLES_XML_RES_PATH = SETTINGS + "/" + INDEXABLES_XML_RES;
    public static final String INDEXABLES_RAW_PATH = SETTINGS + "/" + INDEXABLES_RAW;
    public static final String NON_INDEXABLES_KEYS_PATH = SETTINGS + "/" + NON_INDEXABLES_KEYS;
    public static final String SITE_MAP_PAIRS_PATH = SETTINGS + "/" + SITE_MAP_PAIRS_KEYS;
    public static final String SLICE_URI_PAIRS_PATH = SETTINGS + "/" + SLICE_URI_PAIRS;
    public static final String DYNAMIC_INDEXABLES_RAW_PATH = SETTINGS + "/" + DYNAMIC_INDEXABLES_RAW;
    public static final String[] INDEXABLES_XML_RES_COLUMNS = new String[]{"rank", "xmlResId", "className", "iconResId", "intentAction", "intentTargetPackage", "intentTargetClass"};
    public static final String[] INDEXABLES_RAW_COLUMNS = new String[]{"rank", "title", "summaryOn", "summaryOff", "entries", "keywords", "screenTitle", "className", "iconResId", "intentAction", "intentTargetPackage", "intentTargetClass", "key", "userId", "payloadType", "payload"};
    public static final String[] NON_INDEXABLES_KEYS_COLUMNS = new String[]{"key"};
    public static final int COLUMN_INDEX_RAW_RANK = 0;
    public static final int COLUMN_INDEX_RAW_TITLE = 1;
    public static final int COLUMN_INDEX_RAW_SUMMARY_ON = 2;
    public static final int COLUMN_INDEX_RAW_SUMMARY_OFF = 3;
    public static final int COLUMN_INDEX_RAW_ENTRIES = 4;
    public static final int COLUMN_INDEX_RAW_KEYWORDS = 5;
    public static final int COLUMN_INDEX_RAW_SCREEN_TITLE = 6;
    public static final int COLUMN_INDEX_RAW_CLASS_NAME = 7;
    public static final int COLUMN_INDEX_RAW_ICON_RESID = 8;
    public static final int COLUMN_INDEX_RAW_INTENT_ACTION = 9;
    public static final int COLUMN_INDEX_RAW_INTENT_TARGET_PACKAGE = 10;
    public static final int COLUMN_INDEX_RAW_INTENT_TARGET_CLASS = 11;
    public static final int COLUMN_INDEX_RAW_KEY = 12;
    public static final int COLUMN_INDEX_RAW_USER_ID = 13;
    public static final int COLUMN_INDEX_RAW_PAYLOAD_TYPE = 14;
    public static final int COLUMN_INDEX_RAW_PAYLOAD = 15;
    public static final class SiteMapColumns {
        public static final String PARENT_CLASS = "parent_class";
        public static final String CHILD_CLASS = "child_class";
        public static final String PARENT_TITLE = "parent_title";
        public static final String CHILD_TITLE = "child_title";
    }
    public static final class XmlResource extends BaseColumns {
        private XmlResource() {}
        public static final String MIME_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + INDEXABLES_XML_RES;
        public static final String COLUMN_XML_RESID = "xmlResId";
    }
    public static final class RawData extends BaseColumns {
        private RawData() {}
        public static final String MIME_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + INDEXABLES_RAW;
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_SUMMARY_ON = "summaryOn";
        public static final String COLUMN_SUMMARY_OFF = "summaryOff";
        public static final String COLUMN_ENTRIES = "entries";
        public static final String COLUMN_KEYWORDS = "keywords";
        public static final String COLUMN_SCREEN_TITLE = "screenTitle";
        public static final String COLUMN_KEY = "key";
        public static final String COLUMN_USER_ID = "user_id";
        public static final String PAYLOAD_TYPE = "payload_type";
        public static final String PAYLOAD = "payload";
    }
    public static final class NonIndexableKey extends BaseColumns {
        private NonIndexableKey() {}
        public static final String MIME_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + NON_INDEXABLES_KEYS;
        public static final String COLUMN_KEY_VALUE = "key";
    }
    public static class BaseColumns {
        private BaseColumns() {}
        public static final String COLUMN_RANK = "rank";
        public static final String COLUMN_CLASS_NAME = "className";
        public static final String COLUMN_ICON_RESID = "iconResId";
        public static final String COLUMN_INTENT_ACTION = "intentAction";
        public static final String COLUMN_INTENT_TARGET_PACKAGE = "intentTargetPackage";
        public static final String COLUMN_INTENT_TARGET_CLASS = "intentTargetClass";
    }
}
