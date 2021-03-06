package io.aggreg.app.utils;

import io.aggreg.app.BuildConfig;

public class References {
    public static final int PUBLISHER_LOADER = 0;
    public static final int ARTICLES_LOADER = 1;
    public static final int ARTICLE_DETAIL_LOADER = 2;
    public static final int ARTICLE_RELATED_LOADER = 3;
    public static final String KEY_PREFERENCES = "preferences";
    public static final String KEY_LAST_SYNC = "last_sync";

    public static final String ARG_KEY_CATEGORY_ID = "category_id";
    public static final String ARG_KEY_ARTICLE_ID = "article_id";
    public static final String ARG_KEY_ARTICLE_LINK = "article_link";
    public static final String ARG_KEY_SYNC_TYPE = "sync_type";
    public static final String SYNC_TYPE_PUBLISHER_CATEGORY = "sync_publisher_category";
    public static final String SYNC_TYPE_ARTICLE_REFRESH = "sync_type_article_refresh";

    public static final String ARG_KEY_PARCEL = "parcel";
    public static final String ARG_KEY_ARTICLE_HAS_IMAGE = "article_has_image";
    public static final String ARG_KEY_IS_TAB_TWO_PANE = "is_tab_two_pane";
    public static final String ARG_KEY_CURSOR_POSITION = "cursor_position";
    public static final String ARG_KEY_IS_BOOKMARKS = "is_bookmarks";
    public static final String CATEGORY_SETUP_COMPLETE = "category_setup_complete";
    public static final String PUBLISHERS_SETUP_COMPLETE = "publishers_set_up";
    public static final int REQUEST_CODE = 0;

    public static final String AUTHORITY = BuildConfig.APPLICATION_ID + ".provider";

    public static final String KEY_HAS_INTRO_BEEN_SHOWN = "intro";
    public static final String ARG_KEY_SHORT_DESC = "short_description";
    public static final String ARG_KEY_LONG_DESC = "long_description";
    public static final String ARG_KEY_PIC_URL = "picture_id";
}
