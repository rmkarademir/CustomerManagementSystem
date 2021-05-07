package utils;

public class Result implements interfaces.Result {
	
	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success = success;
	}
	
	public Result(Boolean success, String message) {
		this(success);
		this.message = message;
	}
	
	@Override
	public boolean isSuccess() {
		
		return true;
	}

	@Override
	public String getMessage() {

		return "doðrulanamadý";
	}

}
