package md53c654348f9cb9b1590e5aa90cccadedc;


public class AndroidDataFormSeekBarEditor
	extends com.telerik.widget.dataform.visualization.editors.DataFormSeekBarEditor
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_value:()Ljava/lang/Object;:GetValueHandler\n" +
			"n_applyEntityValueToEditor:(Ljava/lang/Object;)V:GetApplyEntityValueToEditor_Ljava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.InputRenderer.Android.DataForm.AndroidDataFormSeekBarEditor, Telerik.XamarinForms.InputRenderer.Android, Version=2016.2.708.230, Culture=neutral, PublicKeyToken=null", AndroidDataFormSeekBarEditor.class, __md_methods);
	}


	public AndroidDataFormSeekBarEditor (com.telerik.widget.dataform.visualization.RadDataForm p0, com.telerik.widget.dataform.engine.EntityProperty p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == AndroidDataFormSeekBarEditor.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.DataForm.AndroidDataFormSeekBarEditor, Telerik.XamarinForms.InputRenderer.Android, Version=2016.2.708.230, Culture=neutral, PublicKeyToken=null", "Com.Telerik.Widget.Dataform.Visualization.RadDataForm, Telerik.Xamarin.Android.Input, Version=2016.2.708.0, Culture=neutral, PublicKeyToken=null:Com.Telerik.Widget.Dataform.Engine.IEntityProperty, Telerik.Xamarin.Android.Input, Version=2016.2.708.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0, p1 });
	}


	public java.lang.Object value ()
	{
		return n_value ();
	}

	private native java.lang.Object n_value ();


	public void applyEntityValueToEditor (java.lang.Object p0)
	{
		n_applyEntityValueToEditor (p0);
	}

	private native void n_applyEntityValueToEditor (java.lang.Object p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
