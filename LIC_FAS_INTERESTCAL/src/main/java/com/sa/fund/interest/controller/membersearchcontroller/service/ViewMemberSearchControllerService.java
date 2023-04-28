@Service
public class ViewMemberSearchControllerService {
	
	@Autowired
	private ViewMemberSearchControllerRepository viewMemberSearchControllerRepository;
	
	/**
	 * Method to get account details
	 * @param payload
	 * @return Account details
	 */
	public ResponseEntity<Object> getAccountDetails(String payload) {
		try {
			ResponseEntity<Object> response = viewMemberSearchControllerRepository.getAccountDetails(payload);
			return viewMemberSearchControllerRepository.formatResponse(response);
		} catch (Exception ex) {
			viewMemberSearchControllerRepository.logError(ex);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * Method to check if records exist
	 * @return boolean
	 */
	public boolean checkIfRecordsExist() {
		try {
			return viewMemberSearchControllerRepository.checkIfRecordsExist();
		} catch (Exception ex) {
			viewMemberSearchControllerRepository.logError(ex);
			return false;
		}
	}
	
	/**
	 * Method to return response with message no records found
	 * @return ResponseEntity
	 */
	public ResponseEntity<Object> responseNoRecordsFound() {
		try {
			return viewMemberSearchControllerRepository.responseNoRecordsFound();
		} catch (Exception ex) {
			viewMemberSearchControllerRepository.logError(ex);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}