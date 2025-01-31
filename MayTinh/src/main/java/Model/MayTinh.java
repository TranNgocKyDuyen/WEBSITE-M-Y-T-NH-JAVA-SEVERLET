package Model;

public class MayTinh implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String id, ima, name, mota;
	private double price;
	public MayTinh() {
		super();
		id = "";
		ima = "";
		name = "";
		price = 0.0;
		mota = "";
	}

	public MayTinh(String id, String ima, String name, double price, String mota) {
		super();
		this.id = id;
		this.ima = ima;
		this.name = name;
		this.price = price;
		this.mota = mota;
	}
	public MayTinh(String id, String ima, String name, double price) {
		super();
		this.id = id;
		this.ima = ima;
		this.name = name;
		this.price = price;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIma() {
		return ima;
	}
	public void setIma(String ima) {
		this.ima = ima;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}