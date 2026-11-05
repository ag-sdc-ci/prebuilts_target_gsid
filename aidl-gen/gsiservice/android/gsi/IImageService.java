/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/system/gsid/aidl-gen/gsiservice -I aidl aidl/android/gsi/IImageService.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.gsi;
/** {@hide} */
public interface IImageService extends android.os.IInterface
{
  /** Default implementation for IImageService. */
  public static class Default implements android.gsi.IImageService
  {
    /**
     * Create an image that can be mapped as a block device.
     * 
     * This call will fail if running a GSI.
     * 
     * @param name          Image name. If the image already exists, the call will fail.
     * @param size          Image size, in bytes. If too large, or not enough space is
     *                      free, the call will fail.
     * @param readonly      If readonly, MapBackingImage() will configure the device as
     *                      readonly.
     * @param on_progress   Progress callback. It is invoked when there is an interesting update.
     *                      For each invocation, |current| is the number of bytes actually written,
     *                      and |total| is set to |size|.
     * @throws ServiceSpecificException if any error occurs. Exception code is a
     *                      FiemapStatus::ErrorCode value.
     */
    @Override public void createBackingImage(java.lang.String name, long size, int flags, android.gsi.IProgressCallback on_progress) throws android.os.RemoteException
    {
    }
    /**
     * Delete an image created with createBackingImage.
     * 
     * @param name          Image name as passed to createBackingImage().
     * @throws ServiceSpecificException if any error occurs.
     */
    @Override public void deleteBackingImage(java.lang.String name) throws android.os.RemoteException
    {
    }
    /**
     * Map an image, created with createBackingImage, such that it is accessible as a
     * block device.
     * 
     * @param name          Image name as passed to createBackingImage().
     * @param timeout_ms    Time to wait for a valid mapping, in milliseconds. This must be more
     *                      than zero; 10 seconds is recommended.
     * @param mapping       Information about the newly mapped block device.
     */
    @Override public void mapImageDevice(java.lang.String name, int timeout_ms, android.gsi.MappedImage mapping) throws android.os.RemoteException
    {
    }
    /**
     * Unmap a block device previously mapped with mapBackingImage. This step is necessary before
     * calling deleteBackingImage.
     * 
     * @param name          Image name as passed to createBackingImage().
     */
    @Override public void unmapImageDevice(java.lang.String name) throws android.os.RemoteException
    {
    }
    /**
     * Returns whether or not a backing image exists.
     * 
     * @param name          Image name as passed to createBackingImage().
     */
    @Override public boolean backingImageExists(java.lang.String name) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * Returns whether or not the named image is mapped.
     * 
     * @param name          Image name as passed to createBackingImage().
     */
    @Override public boolean isImageMapped(java.lang.String name) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * Retrieve AVB public key from an image.
     * If the image is already mapped then it works the same as
     * IGsiService::getAvbPublicKey(). Otherwise this will attempt to
     * map / unmap the partition image upon enter / return.
     * 
     * @param name          Image name as passed to createBackingImage().
     * @param dst           Output of the AVB public key.
     * @return              0 on success, an error code on failure.
     */
    @Override public int getAvbPublicKey(java.lang.String name, android.gsi.AvbPublicKey dst) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Get all installed backing image names
     * 
     * @return list of installed backing image names
     */
    @Override public java.util.List<java.lang.String> getAllBackingImages() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Writes a given amount of zeros in image file.
     * 
     * @param name          Image name. If the image does not exist, the call
     *                      will fail.
     * @param bytes         Number of zeros to be written, starting from the
     *                      beginning. If bytes is equal to 0, then the whole
     *                      image file is filled with zeros.
     * @throws ServiceSpecificException if any error occurs. Exception code is a
     *                      FiemapStatus::ErrorCode value.
     */
    @Override public void zeroFillNewImage(java.lang.String name, long bytes) throws android.os.RemoteException
    {
    }
    /** Find and remove all images in the containing folder of this instance. */
    @Override public void removeAllImages() throws android.os.RemoteException
    {
    }
    /** Mark an image as disabled. */
    @Override public void disableImage(java.lang.String name) throws android.os.RemoteException
    {
    }
    /** Remove all images that were marked as disabled. */
    @Override public void removeDisabledImages() throws android.os.RemoteException
    {
    }
    /** Return whether an image is disabled. */
    @Override public boolean isImageDisabled(java.lang.String name) throws android.os.RemoteException
    {
      return false;
    }
    /** Return the block device path of a mapped image, or an empty string if not mapped. */
    @Override public java.lang.String getMappedImageDevice(java.lang.String name) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.gsi.IImageService
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.gsi.IImageService interface,
     * generating a proxy if needed.
     */
    public static android.gsi.IImageService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.gsi.IImageService))) {
        return ((android.gsi.IImageService)iin);
      }
      return new android.gsi.IImageService.Stub.Proxy(obj);
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
        case TRANSACTION_createBackingImage:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          long _arg1;
          _arg1 = data.readLong();
          int _arg2;
          _arg2 = data.readInt();
          android.gsi.IProgressCallback _arg3;
          _arg3 = android.gsi.IProgressCallback.Stub.asInterface(data.readStrongBinder());
          this.createBackingImage(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_deleteBackingImage:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.deleteBackingImage(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_mapImageDevice:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.gsi.MappedImage _arg2;
          _arg2 = new android.gsi.MappedImage();
          this.mapImageDevice(_arg0, _arg1, _arg2);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _arg2, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_unmapImageDevice:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.unmapImageDevice(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_backingImageExists:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.backingImageExists(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_isImageMapped:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.isImageMapped(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_getAvbPublicKey:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          android.gsi.AvbPublicKey _arg1;
          _arg1 = new android.gsi.AvbPublicKey();
          int _result = this.getAvbPublicKey(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          _Parcel.writeTypedObject(reply, _arg1, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_getAllBackingImages:
        {
          java.util.List<java.lang.String> _result = this.getAllBackingImages();
          reply.writeNoException();
          reply.writeStringList(_result);
          break;
        }
        case TRANSACTION_zeroFillNewImage:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          long _arg1;
          _arg1 = data.readLong();
          this.zeroFillNewImage(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_removeAllImages:
        {
          this.removeAllImages();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_disableImage:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.disableImage(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_removeDisabledImages:
        {
          this.removeDisabledImages();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_isImageDisabled:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.isImageDisabled(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_getMappedImageDevice:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _result = this.getMappedImageDevice(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.gsi.IImageService
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
       * Create an image that can be mapped as a block device.
       * 
       * This call will fail if running a GSI.
       * 
       * @param name          Image name. If the image already exists, the call will fail.
       * @param size          Image size, in bytes. If too large, or not enough space is
       *                      free, the call will fail.
       * @param readonly      If readonly, MapBackingImage() will configure the device as
       *                      readonly.
       * @param on_progress   Progress callback. It is invoked when there is an interesting update.
       *                      For each invocation, |current| is the number of bytes actually written,
       *                      and |total| is set to |size|.
       * @throws ServiceSpecificException if any error occurs. Exception code is a
       *                      FiemapStatus::ErrorCode value.
       */
      @Override public void createBackingImage(java.lang.String name, long size, int flags, android.gsi.IProgressCallback on_progress) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          _data.writeLong(size);
          _data.writeInt(flags);
          _data.writeStrongInterface(on_progress);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createBackingImage, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Delete an image created with createBackingImage.
       * 
       * @param name          Image name as passed to createBackingImage().
       * @throws ServiceSpecificException if any error occurs.
       */
      @Override public void deleteBackingImage(java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteBackingImage, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Map an image, created with createBackingImage, such that it is accessible as a
       * block device.
       * 
       * @param name          Image name as passed to createBackingImage().
       * @param timeout_ms    Time to wait for a valid mapping, in milliseconds. This must be more
       *                      than zero; 10 seconds is recommended.
       * @param mapping       Information about the newly mapped block device.
       */
      @Override public void mapImageDevice(java.lang.String name, int timeout_ms, android.gsi.MappedImage mapping) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          _data.writeInt(timeout_ms);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mapImageDevice, _data, _reply, 0);
          _reply.readException();
          if ((0!=_reply.readInt())) {
            mapping.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Unmap a block device previously mapped with mapBackingImage. This step is necessary before
       * calling deleteBackingImage.
       * 
       * @param name          Image name as passed to createBackingImage().
       */
      @Override public void unmapImageDevice(java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unmapImageDevice, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Returns whether or not a backing image exists.
       * 
       * @param name          Image name as passed to createBackingImage().
       */
      @Override public boolean backingImageExists(java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_backingImageExists, _data, _reply, 0);
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
       * Returns whether or not the named image is mapped.
       * 
       * @param name          Image name as passed to createBackingImage().
       */
      @Override public boolean isImageMapped(java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isImageMapped, _data, _reply, 0);
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
       * Retrieve AVB public key from an image.
       * If the image is already mapped then it works the same as
       * IGsiService::getAvbPublicKey(). Otherwise this will attempt to
       * map / unmap the partition image upon enter / return.
       * 
       * @param name          Image name as passed to createBackingImage().
       * @param dst           Output of the AVB public key.
       * @return              0 on success, an error code on failure.
       */
      @Override public int getAvbPublicKey(java.lang.String name, android.gsi.AvbPublicKey dst) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
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
      /**
       * Get all installed backing image names
       * 
       * @return list of installed backing image names
       */
      @Override public java.util.List<java.lang.String> getAllBackingImages() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAllBackingImages, _data, _reply, 0);
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
       * Writes a given amount of zeros in image file.
       * 
       * @param name          Image name. If the image does not exist, the call
       *                      will fail.
       * @param bytes         Number of zeros to be written, starting from the
       *                      beginning. If bytes is equal to 0, then the whole
       *                      image file is filled with zeros.
       * @throws ServiceSpecificException if any error occurs. Exception code is a
       *                      FiemapStatus::ErrorCode value.
       */
      @Override public void zeroFillNewImage(java.lang.String name, long bytes) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          _data.writeLong(bytes);
          boolean _status = mRemote.transact(Stub.TRANSACTION_zeroFillNewImage, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /** Find and remove all images in the containing folder of this instance. */
      @Override public void removeAllImages() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeAllImages, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /** Mark an image as disabled. */
      @Override public void disableImage(java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_disableImage, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /** Remove all images that were marked as disabled. */
      @Override public void removeDisabledImages() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeDisabledImages, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /** Return whether an image is disabled. */
      @Override public boolean isImageDisabled(java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isImageDisabled, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** Return the block device path of a mapped image, or an empty string if not mapped. */
      @Override public java.lang.String getMappedImageDevice(java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getMappedImageDevice, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_createBackingImage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_deleteBackingImage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_mapImageDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_unmapImageDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_backingImageExists = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_isImageMapped = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getAvbPublicKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getAllBackingImages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_zeroFillNewImage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_removeAllImages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_disableImage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_removeDisabledImages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_isImageDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getMappedImageDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.gsi.IImageService";
  /** These flags match fiemap::ImageManager::CreateBackingImage. */
  public static final int CREATE_IMAGE_DEFAULT = 0;
  public static final int CREATE_IMAGE_READONLY = 1;
  public static final int CREATE_IMAGE_ZERO_FILL = 2;
  /** Successfully returned */
  public static final int IMAGE_OK = 0;
  /** Generic error code */
  public static final int IMAGE_ERROR = 1;
  /**
   * Create an image that can be mapped as a block device.
   * 
   * This call will fail if running a GSI.
   * 
   * @param name          Image name. If the image already exists, the call will fail.
   * @param size          Image size, in bytes. If too large, or not enough space is
   *                      free, the call will fail.
   * @param readonly      If readonly, MapBackingImage() will configure the device as
   *                      readonly.
   * @param on_progress   Progress callback. It is invoked when there is an interesting update.
   *                      For each invocation, |current| is the number of bytes actually written,
   *                      and |total| is set to |size|.
   * @throws ServiceSpecificException if any error occurs. Exception code is a
   *                      FiemapStatus::ErrorCode value.
   */
  public void createBackingImage(java.lang.String name, long size, int flags, android.gsi.IProgressCallback on_progress) throws android.os.RemoteException;
  /**
   * Delete an image created with createBackingImage.
   * 
   * @param name          Image name as passed to createBackingImage().
   * @throws ServiceSpecificException if any error occurs.
   */
  public void deleteBackingImage(java.lang.String name) throws android.os.RemoteException;
  /**
   * Map an image, created with createBackingImage, such that it is accessible as a
   * block device.
   * 
   * @param name          Image name as passed to createBackingImage().
   * @param timeout_ms    Time to wait for a valid mapping, in milliseconds. This must be more
   *                      than zero; 10 seconds is recommended.
   * @param mapping       Information about the newly mapped block device.
   */
  public void mapImageDevice(java.lang.String name, int timeout_ms, android.gsi.MappedImage mapping) throws android.os.RemoteException;
  /**
   * Unmap a block device previously mapped with mapBackingImage. This step is necessary before
   * calling deleteBackingImage.
   * 
   * @param name          Image name as passed to createBackingImage().
   */
  public void unmapImageDevice(java.lang.String name) throws android.os.RemoteException;
  /**
   * Returns whether or not a backing image exists.
   * 
   * @param name          Image name as passed to createBackingImage().
   */
  public boolean backingImageExists(java.lang.String name) throws android.os.RemoteException;
  /**
   * Returns whether or not the named image is mapped.
   * 
   * @param name          Image name as passed to createBackingImage().
   */
  public boolean isImageMapped(java.lang.String name) throws android.os.RemoteException;
  /**
   * Retrieve AVB public key from an image.
   * If the image is already mapped then it works the same as
   * IGsiService::getAvbPublicKey(). Otherwise this will attempt to
   * map / unmap the partition image upon enter / return.
   * 
   * @param name          Image name as passed to createBackingImage().
   * @param dst           Output of the AVB public key.
   * @return              0 on success, an error code on failure.
   */
  public int getAvbPublicKey(java.lang.String name, android.gsi.AvbPublicKey dst) throws android.os.RemoteException;
  /**
   * Get all installed backing image names
   * 
   * @return list of installed backing image names
   */
  public java.util.List<java.lang.String> getAllBackingImages() throws android.os.RemoteException;
  /**
   * Writes a given amount of zeros in image file.
   * 
   * @param name          Image name. If the image does not exist, the call
   *                      will fail.
   * @param bytes         Number of zeros to be written, starting from the
   *                      beginning. If bytes is equal to 0, then the whole
   *                      image file is filled with zeros.
   * @throws ServiceSpecificException if any error occurs. Exception code is a
   *                      FiemapStatus::ErrorCode value.
   */
  public void zeroFillNewImage(java.lang.String name, long bytes) throws android.os.RemoteException;
  /** Find and remove all images in the containing folder of this instance. */
  public void removeAllImages() throws android.os.RemoteException;
  /** Mark an image as disabled. */
  public void disableImage(java.lang.String name) throws android.os.RemoteException;
  /** Remove all images that were marked as disabled. */
  public void removeDisabledImages() throws android.os.RemoteException;
  /** Return whether an image is disabled. */
  public boolean isImageDisabled(java.lang.String name) throws android.os.RemoteException;
  /** Return the block device path of a mapped image, or an empty string if not mapped. */
  public java.lang.String getMappedImageDevice(java.lang.String name) throws android.os.RemoteException;
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
