@Repository
public interface ProcessPolicyMemberByServiceIdFundPolicyServiceControllerRepository {

    // Method to retrieve the service details using the service ID provided
    public ServiceModule getServiceDetails(Long serviceId);

    // Method to process the fund for the service module
    public void processFundForServiceModule(ServiceModule serviceModule);

    // Method to return the response with a status of SUCCESS along with a message
    // indicating that the fund processing was successful
    public Map<String, Object> getResponseWithSuccessStatus(Long sourcePolicyId, Long destinationPolicyId);
}