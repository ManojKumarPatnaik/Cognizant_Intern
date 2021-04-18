
public class Vehicle implements Loan,Insurance {
	
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType,double price) {
		
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType=vehicleType;
		this.price = price;
	}
	@Override
	public double issueLoan(){
	    if(this.vehicleType.equals("4 wheeler")){
	        return this.price*0.8;
	    }
	    else if(this.vehicleType.equals("3 wheeler")){
	        return this.price*0.75;
	    }
	    else{
	        return this.price*0.5;
	    }
	}
    @Override
    public double takeInsurance(){
        if(this.price<=150000 ){
            return 3500.0;
        }
        else if(this.price>150000 && this.price<=300000 ){
            return 4000.0;
        }
        else{
            return 5000.0;
        }
    }
}
