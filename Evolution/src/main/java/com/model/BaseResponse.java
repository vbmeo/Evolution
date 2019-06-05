package evolutionWeb.model;
//questa fa da base ad ogni respionse, e dice se è andato tutto a buon fine e il suo codice corrispondente

public class BaseResponse {
	 private String status;
	 private Integer code;
	 
	 public String getStatus() {
	  return status;
	 }
	 public void setStatus(String status) {
	  this.status = status;
	 }
	 public Integer getCode() {
	  return code;
	 }
	 public void setCode(Integer code) {
	  this.code = code;
	 }
}
