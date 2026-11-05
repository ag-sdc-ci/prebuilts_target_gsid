/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/system/gsid/aidl-gen/gsiservice -I aidl aidl/android/gsi/IProgressCallback.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.gsi;
/** {@hide} */
public interface IProgressCallback extends android.os.IInterface
{
  /** Default implementation for IProgressCallback. */
  public static class Default implements android.gsi.IProgressCallback
  {
    /**
     * Report progress for a long-running task.
     * 
     * The percentage can be computed using current / total. The task is
     * done when current == total.
     * 
     * Different APIs may have different meanings for the parameters; see
     * specific APIs for details.
     * 
     * @param current   a value indicating the current progress. Should be treated as uint64.
     * @param total     a value indicating 100% progress. Should be treated as uint64.
     */
    @Override public void onProgress(long current, long total) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.gsi.IProgressCallback
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.gsi.IProgressCallback interface,
     * generating a proxy if needed.
     */
    public static android.gsi.IProgressCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.gsi.IProgressCallback))) {
        return ((android.gsi.IProgressCallback)iin);
      }
      return new android.gsi.IProgressCallback.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(DESCRIPTOR);
      }
      switch (code)
      {
        case TRANSACTION_onProgress:
        {
          long _arg0;
          _arg0 = data.readLong();
          long _arg1;
          _arg1 = data.readLong();
          this.onProgress(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.gsi.IProgressCallback
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public final java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
       * Report progress for a long-running task.
       * 
       * The percentage can be computed using current / total. The task is
       * done when current == total.
       * 
       * Different APIs may have different meanings for the parameters; see
       * specific APIs for details.
       * 
       * @param current   a value indicating the current progress. Should be treated as uint64.
       * @param total     a value indicating 100% progress. Should be treated as uint64.
       */
      @Override public void onProgress(long current, long total) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(current);
          _data.writeLong(total);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onProgress, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onProgress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.gsi.IProgressCallback";
  /**
   * Report progress for a long-running task.
   * 
   * The percentage can be computed using current / total. The task is
   * done when current == total.
   * 
   * Different APIs may have different meanings for the parameters; see
   * specific APIs for details.
   * 
   * @param current   a value indicating the current progress. Should be treated as uint64.
   * @param total     a value indicating 100% progress. Should be treated as uint64.
   */
  public void onProgress(long current, long total) throws android.os.RemoteException;
}
