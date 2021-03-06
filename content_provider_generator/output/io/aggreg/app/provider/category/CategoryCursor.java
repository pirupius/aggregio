package io.aggreg.app.provider.category;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import io.aggreg.app.provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code category} table.
 */
public class CategoryCursor extends AbstractCursor implements CategoryModel {
    public CategoryCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(CategoryColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code name} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getName() {
        String res = getStringOrNull(CategoryColumns.NAME);
        return res;
    }

    /**
     * Get the {@code image_url} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getImageUrl() {
        String res = getStringOrNull(CategoryColumns.IMAGE_URL);
        return res;
    }

    /**
     * Get the {@code order} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getOrder() {
        Integer res = getIntegerOrNull(CategoryColumns.ORDER);
        return res;
    }
}
