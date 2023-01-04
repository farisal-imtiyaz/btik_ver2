package com.example.btik.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.btik.dashboard.DataBarang;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class DataBarangDao_Impl implements DataBarangDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DataBarang> __insertionAdapterOfDataBarang;

  private final EntityDeletionOrUpdateAdapter<DataBarang> __updateAdapterOfDataBarang;

  private final SharedSQLiteStatement __preparedStmtOfDeleteData;

  public DataBarangDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDataBarang = new EntityInsertionAdapter<DataBarang>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `dataBarang` (`uid`,`namaBarang`,`hargaBarang`,`imgBarang`,`info`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DataBarang value) {
        stmt.bindLong(1, value.getUid());
        if (value.getNamaBarang() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNamaBarang());
        }
        stmt.bindLong(3, value.getHargaBarang());
        if (value.getImgBarang() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImgBarang());
        }
        if (value.getInfo() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getInfo());
        }
      }
    };
    this.__updateAdapterOfDataBarang = new EntityDeletionOrUpdateAdapter<DataBarang>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `dataBarang` SET `uid` = ?,`namaBarang` = ?,`hargaBarang` = ?,`imgBarang` = ?,`info` = ? WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DataBarang value) {
        stmt.bindLong(1, value.getUid());
        if (value.getNamaBarang() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNamaBarang());
        }
        stmt.bindLong(3, value.getHargaBarang());
        if (value.getImgBarang() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImgBarang());
        }
        if (value.getInfo() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getInfo());
        }
        stmt.bindLong(6, value.getUid());
      }
    };
    this.__preparedStmtOfDeleteData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM dataBarang";
        return _query;
      }
    };
  }

  @Override
  public Object addData(final DataBarang dataBarang,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDataBarang.insert(dataBarang);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateData(final DataBarang dataBarang,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfDataBarang.handle(dataBarang);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void deleteData() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteData.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteData.release(_stmt);
    }
  }

  @Override
  public Flow<List<DataBarang>> getAllData() {
    final String _sql = "SELECT * FROM dataBarang";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"dataBarang"}, new Callable<List<DataBarang>>() {
      @Override
      public List<DataBarang> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfNamaBarang = CursorUtil.getColumnIndexOrThrow(_cursor, "namaBarang");
          final int _cursorIndexOfHargaBarang = CursorUtil.getColumnIndexOrThrow(_cursor, "hargaBarang");
          final int _cursorIndexOfImgBarang = CursorUtil.getColumnIndexOrThrow(_cursor, "imgBarang");
          final int _cursorIndexOfInfo = CursorUtil.getColumnIndexOrThrow(_cursor, "info");
          final List<DataBarang> _result = new ArrayList<DataBarang>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DataBarang _item;
            final int _tmpUid;
            _tmpUid = _cursor.getInt(_cursorIndexOfUid);
            final String _tmpNamaBarang;
            if (_cursor.isNull(_cursorIndexOfNamaBarang)) {
              _tmpNamaBarang = null;
            } else {
              _tmpNamaBarang = _cursor.getString(_cursorIndexOfNamaBarang);
            }
            final long _tmpHargaBarang;
            _tmpHargaBarang = _cursor.getLong(_cursorIndexOfHargaBarang);
            final String _tmpImgBarang;
            if (_cursor.isNull(_cursorIndexOfImgBarang)) {
              _tmpImgBarang = null;
            } else {
              _tmpImgBarang = _cursor.getString(_cursorIndexOfImgBarang);
            }
            final String _tmpInfo;
            if (_cursor.isNull(_cursorIndexOfInfo)) {
              _tmpInfo = null;
            } else {
              _tmpInfo = _cursor.getString(_cursorIndexOfInfo);
            }
            _item = new DataBarang(_tmpUid,_tmpNamaBarang,_tmpHargaBarang,_tmpImgBarang,_tmpInfo);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
