package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;

/** =====================================================
 * Endpoint state changed.
 * 
 * Defined in file :events.json
 * ====================================================== */
public class EndpointStateChange_impl_ari_0_0_1 extends Event_impl_ari_0_0_1 implements EndpointStateChange, java.io.Serializable {
  /**    */
  private Endpoint endpoint;
 public Endpoint getEndpoint() {
   return endpoint;
 }

 public void setEndpoint(Endpoint val ) {
   endpoint = val;
 }

}

