package md5551b8be3656f3c58263335742ae3c8e5;


public class SwipeToRefreshListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.telerik.widget.list.SwipeRefreshBehavior.SwipeRefreshListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRefreshRequested:()V:GetOnRefreshRequestedHandler:Com.Telerik.Widget.List.SwipeRefreshBehavior/ISwipeRefreshListenerInvoker, Telerik.Xamarin.Android.List\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.DataControlsRenderer.Android.SwipeToRefreshListener, Telerik.XamarinForms.DataControlsRenderer.Android, Version=2016.2.708.230, Culture=neutral, PublicKeyToken=null", SwipeToRefreshListener.class, __md_methods);
	}


	public SwipeToRefreshListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SwipeToRefreshListener.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.DataControlsRenderer.Android.SwipeToRefreshListener, Telerik.XamarinForms.DataControlsRenderer.Android, Version=2016.2.708.230, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onRefreshRequested ()
	{
		n_onRefreshRequested ();
	}

	private native void n_onRefreshRequested ();

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
