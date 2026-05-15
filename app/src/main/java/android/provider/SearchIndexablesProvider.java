package android.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public abstract class SearchIndexablesProvider extends ContentProvider {
    public abstract Cursor queryXmlResources(String[] projection);
    public abstract Cursor queryRawData(String[] projection);
    public abstract Cursor queryNonIndexableKeys(String[] projection);
    public Cursor querySiteMapPairs() { return null; }
    public Cursor querySliceUriPairs() { return null; }
    public Cursor queryDynamicRawData(String[] projection) { return null; }
    @Override public boolean onCreate() { return true; }
    @Override public Cursor query(Uri u, String[] p, String s, String[] sa, String o) { return null; }
    @Override public String getType(Uri u) { return null; }
    @Override public final Uri insert(Uri uri, ContentValues values) {
        throw new UnsupportedOperationException("Insert not supported");
    }
    @Override public final int delete(Uri uri, String selection, String[] selectionArgs) {
        throw new UnsupportedOperationException("Delete not supported");
    }
    @Override public final int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        throw new UnsupportedOperationException("Update not supported");
    }
}
