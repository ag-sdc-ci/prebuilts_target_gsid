/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/system/gsid/aidl-gen/gsiservice -I aidl aidl/android/gsi/IGsiService.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.gsi;
/** {@hide} */
public interface IGsiService extends android.os.IInterface
{
  /** Default implementation for IGsiService. */
  public static class Default implements android.gsi.IGsiService
  {
    /**
     * Write bytes from a stream to the on-disk GSI.
     * 
     * @param stream        Stream descriptor.
     * @param bytes         Number of bytes that can be read from stream.
     * @return              true on success, false otherwise.
     */
    @Override public boolean commitGsiChunkFromStream(android.os.ParcelFileDescriptor stream, long bytes) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * Query the progress of the current asynchronous install operation. This
     * can be called while another operation is in progress.
     */
    @Override public android.gsi.GsiProgress getInstallProgress() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Set the file descriptor that points to a ashmem which will be used
     * to fetch data during the commitGsiChunkFromAshmem.
     * 
     * @param stream        fd that points to a ashmem
     * @param size          size of the ashmem file
     */
    @Override public boolean setGsiAshmem(android.os.ParcelFileDescriptor stream, long size) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * Write bytes from ashmem previously set with setGsiAshmem to GSI partition
     * 
     * @param bytes         Number of bytes to submit
     * @return              true on success, false otherwise.
     */
    @Override public boolean commitGsiChunkFromAshmem(long bytes) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * Mark a completed DSU installation as bootable. The caller is responsible
     * for rebooting the device as soon as possible.
     * 
     * Could leave the installation in "disabled" state if failure.
     * 
     * @param oneShot       If true, the GSI will boot once and then disable itself.
     *                      It can still be re-enabled again later with setGsiBootable.
     * @param dsuSlot       The DSU slot to be enabled. Possible values are available
     *                      with the getInstalledDsuSlots()
     * 
     * @return              INSTALL_* error code.
     */
    @Override public int enableGsi(boolean oneShot, java.lang.String dsuSlot) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Asynchronous enableGsi
     * @param result        callback for result
     */
    @Override public void enableGsiAsync(boolean oneShot, java.lang.String dsuSlot, android.gsi.IGsiServiceCallback result) throws android.os.RemoteException
    {
    }
    /** @return              True if Gsi is enabled */
    @Override public boolean isGsiEnabled() throws android.os.RemoteException
    {
      return false;
    }
    /** Cancel an in-progress GSI install. */
    @Override public boolean cancelGsiInstall() throws android.os.RemoteException
    {
      return false;
    }
    /** Return if a GSI installation is currently in-progress. */
    @Override public boolean isGsiInstallInProgress() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * Remove a GSI install. This will completely remove and reclaim space used
     * by the GSI and its userdata. If currently running a GSI, space will be
     * reclaimed on the reboot.
     * 
     * @return              true on success, false otherwise.
     */
    @Override public boolean removeGsi() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * Asynchronous removeGsi
     * @param result        callback for result
     */
    @Override public void removeGsiAsync(android.gsi.IGsiServiceCallback result) throws android.os.RemoteException
    {
    }
    /**
     * Disables a GSI install. The image and userdata will be retained, but can
     * be re-enabled at any time with setGsiBootable.
     */
    @Override public boolean disableGsi() throws android.os.RemoteException
    {
      return false;
    }
    /** Returns true if a gsi is installed. */
    @Override public boolean isGsiInstalled() throws android.os.RemoteException
    {
      return false;
    }
    /** Returns true if the gsi is currently running, false otherwise. */
    @Override public boolean isGsiRunning() throws android.os.RemoteException
    {
      return false;
    }
    /** Returns the active DSU slot if there is any DSU installed, empty string otherwise. */
    @Override public java.lang.String getActiveDsuSlot() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * If a GSI is installed, returns the directory where the installed images
     * are located. Otherwise, returns an empty string.
     */
    @Override public java.lang.String getInstalledGsiImageDir() throws android.os.RemoteException
    {
      return null;
    }
    /** Returns all installed DSU slots. */
    @Override public java.util.List<java.lang.String> getInstalledDsuSlots() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Open a DSU installation
     * 
     * @param installDir The directory to install DSU images under. This must be
     *     either an empty string (which will use the default /data/gsi),
     *     "/data/gsi", or a mount under /mnt/media_rw. It may end in a trailing slash.
     * 
     * @return              0 on success, an error code on failure.
     */
    @Override public int openInstall(java.lang.String installDir) throws android.os.RemoteException
    {
      return 0;
    }
    /** Close a DSU installation. An installation is complete after the close been invoked. */
    @Override public int closeInstall() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Create a DSU partition within the current installation
     * 
     * @param name The DSU partition name
     * @param size Bytes in the partition
     * @param readOnly True if the partition is readOnly when DSU is running
     */
    @Override public int createPartition(java.lang.String name, long size, boolean readOnly) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Complete the current partition installation. A partition installation is
     * complete after all pending bytes are written successfully.
     * Returns an error if current installation still have pending bytes.
     * Returns an error if there is any internal filesystem error.
     * 
     * @return              0 on success, an error code on failure.
     */
    @Override public int closePartition() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Wipe a partition. This will not work if the GSI is currently running.
     * The partition will not be removed, but the first block will be zeroed.
     * 
     * @param name The DSU partition name
     * 
     * @return              0 on success, an error code on failure.
     */
    @Override public int zeroPartition(java.lang.String name) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Open a handle to an IImageService for the given metadata and data storage paths.
     * 
     * @param prefix        A prefix used to organize images. The data path will become
     *                      /data/gsi/{prefix} and the metadata path will become
     *                      /metadata/gsi/{prefix}.
     */
    @Override public android.gsi.IImageService openImageService(java.lang.String prefix) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Dump diagnostic information about device-mapper devices. This is intended
     * for dumpstate.
     */
    @Override public java.lang.String dumpDeviceMapperDevices() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Retrieve AVB public key from the current mapped partition.
     * This works only while partition device is mapped and the end-of-partition
     * AVB footer has been written.
     * A call to createPartition() does the following things:
     * 1. Close the previous partition installer, thus unmap the partition.
     * 2. Open a new partition installer.
     * 3. Create and map the new partition.
     * 
     * In other words, getAvbPublicKey() should be called after
     * createPartition() is called and before closePartition() is called.
     * 
     * @param dst           Output the AVB public key.
     * @return              0 on success, an error code on failure.
     */
    @Override public int getAvbPublicKey(android.gsi.AvbPublicKey dst) throws android.os.RemoteException
    {
      return 0;
    }
    /** Returns the suggested scratch partition size for overlayFS. */
    @Override public long suggestScratchSize() throws android.os.RemoteException
    {
      return 0L;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.gsi.IGsiService
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.gsi.IGsiService interface,
     * generating a proxy if needed.
     */
    public static android.gsi.IGsiService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.gsi.IGsiService))) {
        return ((android.gsi.IGsiService)iin);
      }
      return new android.gsi.IGsiService.Stub.Proxy(obj);
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
        case TRANSACTION_commitGsiChunkFromStream:
        {
          android.os.ParcelFileDescriptor _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.ParcelFileDescriptor.CREATOR);
          long _arg1;
          _arg1 = data.readLong();
          boolean _result = this.commitGsiChunkFromStream(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_getInstallProgress:
        {
          android.gsi.GsiProgress _result = this.getInstallProgress();
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_setGsiAshmem:
        {
          android.os.ParcelFileDescriptor _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.ParcelFileDescriptor.CREATOR);
          long _arg1;
          _arg1 = data.readLong();
          boolean _result = this.setGsiAshmem(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_commitGsiChunkFromAshmem:
        {
          long _arg0;
          _arg0 = data.readLong();
          boolean _result = this.commitGsiChunkFromAshmem(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_enableGsi:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _result = this.enableGsi(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_enableGsiAsync:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.gsi.IGsiServiceCallback _arg2;
          _arg2 = android.gsi.IGsiServiceCallback.Stub.asInterface(data.readStrongBinder());
          this.enableGsiAsync(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_isGsiEnabled:
        {
          boolean _result = this.isGsiEnabled();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_cancelGsiInstall:
        {
          boolean _result = this.cancelGsiInstall();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_isGsiInstallInProgress:
        {
          boolean _result = this.isGsiInstallInProgress();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_removeGsi:
        {
          boolean _result = this.removeGsi();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_removeGsiAsync:
        {
          android.gsi.IGsiServiceCallback _arg0;
          _arg0 = android.gsi.IGsiServiceCallback.Stub.asInterface(data.readStrongBinder());
          this.removeGsiAsync(_arg0);
          break;
        }
        case TRANSACTION_disableGsi:
        {
          boolean _result = this.disableGsi();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_isGsiInstalled:
        {
          boolean _result = this.isGsiInstalled();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_isGsiRunning:
        {
          boolean _result = this.isGsiRunning();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_getActiveDsuSlot:
        {
          java.lang.String _result = this.getActiveDsuSlot();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getInstalledGsiImageDir:
        {
          java.lang.String _result = this.getInstalledGsiImageDir();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getInstalledDsuSlots:
        {
          java.util.List<java.lang.String> _result = this.getInstalledDsuSlots();
          reply.writeNoException();
          reply.writeStringList(_result);
          break;
        }
        case TRANSACTION_openInstall:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.openInstall(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_closeInstall:
        {
          int _result = this.closeInstall();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_createPartition:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          long _arg1;
          _arg1 = data.readLong();
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          int _result = this.createPartition(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_closePartition:
        {
          int _result = this.closePartition();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_zeroPartition:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.zeroPartition(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_openImageService:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          android.gsi.IImageService _result = this.openImageService(_arg0);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_dumpDeviceMapperDevices:
        {
          java.lang.String _result = this.dumpDeviceMapperDevices();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getAvbPublicKey:
        {
          android.gsi.AvbPublicKey _arg0;
          _arg0 = new android.gsi.AvbPublicKey();
          int _result = this.getAvbPublicKey(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          _Parcel.writeTypedObject(reply, _arg0, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_suggestScratchSize:
        {
          long _result = this.suggestScratchSize();
          reply.writeNoException();
          reply.writeLong(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.gsi.IGsiService
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
       * Write bytes from a stream to the on-disk GSI.
       * 
       * @param stream        Stream descriptor.
       * @param bytes         Number of bytes that can be read from stream.
       * @return              true on success, false otherwise.
       */
      @Override public boolean commitGsiChunkFromStream(android.os.ParcelFileDescriptor stream, long bytes) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, stream, 0);
          _data.writeLong(bytes);
          boolean _status = mRemote.transact(Stub.TRANSACTION_commitGsiChunkFromStream, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Query the progress of the current asynchronous install operation. This
       * can be called while another operation is in progress.
       */
      @Override public android.gsi.GsiProgress getInstallProgress() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.gsi.GsiProgress _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getInstallProgress, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, android.gsi.GsiProgress.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Set the file descriptor that points to a ashmem which will be used
       * to fetch data during the commitGsiChunkFromAshmem.
       * 
       * @param stream        fd that points to a ashmem
       * @param size          size of the ashmem file
       */
      @Override public boolean setGsiAshmem(android.os.ParcelFileDescriptor stream, long size) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, stream, 0);
          _data.writeLong(size);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setGsiAshmem, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Write bytes from ashmem previously set with setGsiAshmem to GSI partition
       * 
       * @param bytes         Number of bytes to submit
       * @return              true on success, false otherwise.
       */
      @Override public boolean commitGsiChunkFromAshmem(long bytes) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(bytes);
          boolean _status = mRemote.transact(Stub.TRANSACTION_commitGsiChunkFromAshmem, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Mark a completed DSU installation as bootable. The caller is responsible
       * for rebooting the device as soon as possible.
       * 
       * Could leave the installation in "disabled" state if failure.
       * 
       * @param oneShot       If true, the GSI will boot once and then disable itself.
       *                      It can still be re-enabled again later with setGsiBootable.
       * @param dsuSlot       The DSU slot to be enabled. Possible values are available
       *                      with the getInstalledDsuSlots()
       * 
       * @return              INSTALL_* error code.
       */
      @Override public int enableGsi(boolean oneShot, java.lang.String dsuSlot) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((oneShot)?(1):(0)));
          _data.writeString(dsuSlot);
          boolean _status = mRemote.transact(Stub.TRANSACTION_enableGsi, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Asynchronous enableGsi
       * @param result        callback for result
       */
      @Override public void enableGsiAsync(boolean oneShot, java.lang.String dsuSlot, android.gsi.IGsiServiceCallback result) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((oneShot)?(1):(0)));
          _data.writeString(dsuSlot);
          _data.writeStrongInterface(result);
          boolean _status = mRemote.transact(Stub.TRANSACTION_enableGsiAsync, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      /** @return              True if Gsi is enabled */
      @Override public boolean isGsiEnabled() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isGsiEnabled, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** Cancel an in-progress GSI install. */
      @Override public boolean cancelGsiInstall() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancelGsiInstall, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** Return if a GSI installation is currently in-progress. */
      @Override public boolean isGsiInstallInProgress() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isGsiInstallInProgress, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Remove a GSI install. This will completely remove and reclaim space used
       * by the GSI and its userdata. If currently running a GSI, space will be
       * reclaimed on the reboot.
       * 
       * @return              true on success, false otherwise.
       */
      @Override public boolean removeGsi() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeGsi, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Asynchronous removeGsi
       * @param result        callback for result
       */
      @Override public void removeGsiAsync(android.gsi.IGsiServiceCallback result) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(result);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeGsiAsync, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Disables a GSI install. The image and userdata will be retained, but can
       * be re-enabled at any time with setGsiBootable.
       */
      @Override public boolean disableGsi() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_disableGsi, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** Returns true if a gsi is installed. */
      @Override public boolean isGsiInstalled() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isGsiInstalled, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** Returns true if the gsi is currently running, false otherwise. */
      @Override public boolean isGsiRunning() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isGsiRunning, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** Returns the active DSU slot if there is any DSU installed, empty string otherwise. */
      @Override public java.lang.String getActiveDsuSlot() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getActiveDsuSlot, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * If a GSI is installed, returns the directory where the installed images
       * are located. Otherwise, returns an empty string.
       */
      @Override public java.lang.String getInstalledGsiImageDir() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getInstalledGsiImageDir, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** Returns all installed DSU slots. */
      @Override public java.util.List<java.lang.String> getInstalledDsuSlots() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getInstalledDsuSlots, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Open a DSU installation
       * 
       * @param installDir The directory to install DSU images under. This must be
       *     either an empty string (which will use the default /data/gsi),
       *     "/data/gsi", or a mount under /mnt/media_rw. It may end in a trailing slash.
       * 
       * @return              0 on success, an error code on failure.
       */
      @Override public int openInstall(java.lang.String installDir) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(installDir);
          boolean _status = mRemote.transact(Stub.TRANSACTION_openInstall, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** Close a DSU installation. An installation is complete after the close been invoked. */
      @Override public int closeInstall() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_closeInstall, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Create a DSU partition within the current installation
       * 
       * @param name The DSU partition name
       * @param size Bytes in the partition
       * @param readOnly True if the partition is readOnly when DSU is running
       */
      @Override public int createPartition(java.lang.String name, long size, boolean readOnly) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          _data.writeLong(size);
          _data.writeInt(((readOnly)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_createPartition, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Complete the current partition installation. A partition installation is
       * complete after all pending bytes are written successfully.
       * Returns an error if current installation still have pending bytes.
       * Returns an error if there is any internal filesystem error.
       * 
       * @return              0 on success, an error code on failure.
       */
      @Override public int closePartition() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_closePartition, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Wipe a partition. This will not work if the GSI is currently running.
       * The partition will not be removed, but the first block will be zeroed.
       * 
       * @param name The DSU partition name
       * 
       * @return              0 on success, an error code on failure.
       */
      @Override public int zeroPartition(java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_zeroPartition, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Open a handle to an IImageService for the given metadata and data storage paths.
       * 
       * @param prefix        A prefix used to organize images. The data path will become
       *                      /data/gsi/{prefix} and the metadata path will become
       *                      /metadata/gsi/{prefix}.
       */
      @Override public android.gsi.IImageService openImageService(java.lang.String prefix) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.gsi.IImageService _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(prefix);
          boolean _status = mRemote.transact(Stub.TRANSACTION_openImageService, _data, _reply, 0);
          _reply.readException();
          _result = android.gsi.IImageService.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Dump diagnostic information about device-mapper devices. This is intended
       * for dumpstate.
       */
      @Override public java.lang.String dumpDeviceMapperDevices() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_dumpDeviceMapperDevices, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Retrieve AVB public key from the current mapped partition.
       * This works only while partition device is mapped and the end-of-partition
       * AVB footer has been written.
       * A call to createPartition() does the following things:
       * 1. Close the previous partition installer, thus unmap the partition.
       * 2. Open a new partition installer.
       * 3. Create and map the new partition.
       * 
       * In other words, getAvbPublicKey() should be called after
       * createPartition() is called and before closePartition() is called.
       * 
       * @param dst           Output the AVB public key.
       * @return              0 on success, an error code on failure.
       */
      @Override public int getAvbPublicKey(android.gsi.AvbPublicKey dst) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAvbPublicKey, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            dst.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** Returns the suggested scratch partition size for overlayFS. */
      @Override public long suggestScratchSize() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_suggestScratchSize, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_commitGsiChunkFromStream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getInstallProgress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_setGsiAshmem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_commitGsiChunkFromAshmem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_enableGsi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_enableGsiAsync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_isGsiEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_cancelGsiInstall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_isGsiInstallInProgress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_removeGsi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_removeGsiAsync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_disableGsi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_isGsiInstalled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_isGsiRunning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_getActiveDsuSlot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_getInstalledGsiImageDir = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_getInstalledDsuSlots = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_openInstall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_closeInstall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_createPartition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_closePartition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_zeroPartition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_openImageService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_dumpDeviceMapperDevices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_getAvbPublicKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_suggestScratchSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.gsi.IGsiService";
  /** Status codes for GsiProgress.status */
  public static final int STATUS_NO_OPERATION = 0;
  public static final int STATUS_WORKING = 1;
  public static final int STATUS_COMPLETE = 2;
  /** Install succeeded. */
  public static final int INSTALL_OK = 0;
  /** Install failed with a generic system error. */
  public static final int INSTALL_ERROR_GENERIC = 1;
  /** Install failed because there was no free space. */
  public static final int INSTALL_ERROR_NO_SPACE = 2;
  /**
   * Install failed because the file system was too fragmented or did not
   * have enough additional free space.
   */
  public static final int INSTALL_ERROR_FILE_SYSTEM_CLUTTERED = 3;
  /**
   * Write bytes from a stream to the on-disk GSI.
   * 
   * @param stream        Stream descriptor.
   * @param bytes         Number of bytes that can be read from stream.
   * @return              true on success, false otherwise.
   */
  public boolean commitGsiChunkFromStream(android.os.ParcelFileDescriptor stream, long bytes) throws android.os.RemoteException;
  /**
   * Query the progress of the current asynchronous install operation. This
   * can be called while another operation is in progress.
   */
  public android.gsi.GsiProgress getInstallProgress() throws android.os.RemoteException;
  /**
   * Set the file descriptor that points to a ashmem which will be used
   * to fetch data during the commitGsiChunkFromAshmem.
   * 
   * @param stream        fd that points to a ashmem
   * @param size          size of the ashmem file
   */
  public boolean setGsiAshmem(android.os.ParcelFileDescriptor stream, long size) throws android.os.RemoteException;
  /**
   * Write bytes from ashmem previously set with setGsiAshmem to GSI partition
   * 
   * @param bytes         Number of bytes to submit
   * @return              true on success, false otherwise.
   */
  public boolean commitGsiChunkFromAshmem(long bytes) throws android.os.RemoteException;
  /**
   * Mark a completed DSU installation as bootable. The caller is responsible
   * for rebooting the device as soon as possible.
   * 
   * Could leave the installation in "disabled" state if failure.
   * 
   * @param oneShot       If true, the GSI will boot once and then disable itself.
   *                      It can still be re-enabled again later with setGsiBootable.
   * @param dsuSlot       The DSU slot to be enabled. Possible values are available
   *                      with the getInstalledDsuSlots()
   * 
   * @return              INSTALL_* error code.
   */
  public int enableGsi(boolean oneShot, java.lang.String dsuSlot) throws android.os.RemoteException;
  /**
   * Asynchronous enableGsi
   * @param result        callback for result
   */
  public void enableGsiAsync(boolean oneShot, java.lang.String dsuSlot, android.gsi.IGsiServiceCallback result) throws android.os.RemoteException;
  /** @return              True if Gsi is enabled */
  public boolean isGsiEnabled() throws android.os.RemoteException;
  /** Cancel an in-progress GSI install. */
  public boolean cancelGsiInstall() throws android.os.RemoteException;
  /** Return if a GSI installation is currently in-progress. */
  public boolean isGsiInstallInProgress() throws android.os.RemoteException;
  /**
   * Remove a GSI install. This will completely remove and reclaim space used
   * by the GSI and its userdata. If currently running a GSI, space will be
   * reclaimed on the reboot.
   * 
   * @return              true on success, false otherwise.
   */
  public boolean removeGsi() throws android.os.RemoteException;
  /**
   * Asynchronous removeGsi
   * @param result        callback for result
   */
  public void removeGsiAsync(android.gsi.IGsiServiceCallback result) throws android.os.RemoteException;
  /**
   * Disables a GSI install. The image and userdata will be retained, but can
   * be re-enabled at any time with setGsiBootable.
   */
  public boolean disableGsi() throws android.os.RemoteException;
  /** Returns true if a gsi is installed. */
  public boolean isGsiInstalled() throws android.os.RemoteException;
  /** Returns true if the gsi is currently running, false otherwise. */
  public boolean isGsiRunning() throws android.os.RemoteException;
  /** Returns the active DSU slot if there is any DSU installed, empty string otherwise. */
  public java.lang.String getActiveDsuSlot() throws android.os.RemoteException;
  /**
   * If a GSI is installed, returns the directory where the installed images
   * are located. Otherwise, returns an empty string.
   */
  public java.lang.String getInstalledGsiImageDir() throws android.os.RemoteException;
  /** Returns all installed DSU slots. */
  public java.util.List<java.lang.String> getInstalledDsuSlots() throws android.os.RemoteException;
  /**
   * Open a DSU installation
   * 
   * @param installDir The directory to install DSU images under. This must be
   *     either an empty string (which will use the default /data/gsi),
   *     "/data/gsi", or a mount under /mnt/media_rw. It may end in a trailing slash.
   * 
   * @return              0 on success, an error code on failure.
   */
  public int openInstall(java.lang.String installDir) throws android.os.RemoteException;
  /** Close a DSU installation. An installation is complete after the close been invoked. */
  public int closeInstall() throws android.os.RemoteException;
  /**
   * Create a DSU partition within the current installation
   * 
   * @param name The DSU partition name
   * @param size Bytes in the partition
   * @param readOnly True if the partition is readOnly when DSU is running
   */
  public int createPartition(java.lang.String name, long size, boolean readOnly) throws android.os.RemoteException;
  /**
   * Complete the current partition installation. A partition installation is
   * complete after all pending bytes are written successfully.
   * Returns an error if current installation still have pending bytes.
   * Returns an error if there is any internal filesystem error.
   * 
   * @return              0 on success, an error code on failure.
   */
  public int closePartition() throws android.os.RemoteException;
  /**
   * Wipe a partition. This will not work if the GSI is currently running.
   * The partition will not be removed, but the first block will be zeroed.
   * 
   * @param name The DSU partition name
   * 
   * @return              0 on success, an error code on failure.
   */
  public int zeroPartition(java.lang.String name) throws android.os.RemoteException;
  /**
   * Open a handle to an IImageService for the given metadata and data storage paths.
   * 
   * @param prefix        A prefix used to organize images. The data path will become
   *                      /data/gsi/{prefix} and the metadata path will become
   *                      /metadata/gsi/{prefix}.
   */
  public android.gsi.IImageService openImageService(java.lang.String prefix) throws android.os.RemoteException;
  /**
   * Dump diagnostic information about device-mapper devices. This is intended
   * for dumpstate.
   */
  public java.lang.String dumpDeviceMapperDevices() throws android.os.RemoteException;
  /**
   * Retrieve AVB public key from the current mapped partition.
   * This works only while partition device is mapped and the end-of-partition
   * AVB footer has been written.
   * A call to createPartition() does the following things:
   * 1. Close the previous partition installer, thus unmap the partition.
   * 2. Open a new partition installer.
   * 3. Create and map the new partition.
   * 
   * In other words, getAvbPublicKey() should be called after
   * createPartition() is called and before closePartition() is called.
   * 
   * @param dst           Output the AVB public key.
   * @return              0 on success, an error code on failure.
   */
  public int getAvbPublicKey(android.gsi.AvbPublicKey dst) throws android.os.RemoteException;
  /** Returns the suggested scratch partition size for overlayFS. */
  public long suggestScratchSize() throws android.os.RemoteException;
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
  }
}
