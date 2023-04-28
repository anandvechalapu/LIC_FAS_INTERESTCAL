@Repository
public interface ViewMemberSearchControllerRepository {

	/**
	 * Method to get account details
	 * @param payload
	 * @return Account details
	 */
	public ResponseEntity<Object> getAccountDetails(String payload);
	
	/**
	 * Method to log error messages
	 * @param ex
	 */
	public void logError(Exception ex);
	
	/**
	 * Method to format response
	 * @param response
	 * @return Formatted response
	 */
	public ResponseEntity<Object> formatResponse(Object response);
	
	/**
	 * Method to check if records exist
	 * @return boolean
	 */
	public boolean checkIfRecordsExist();
	
	/**
	 * Method to return response with message no records found
	 * @return ResponseEntity
	 */
	public ResponseEntity<Object> responseNoRecordsFound();

}