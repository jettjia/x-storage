/*    */ package org.apache.chemistry.opencmis.commons.impl.jaxb;
/*    */ 
/*    */ import java.net.URL;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ import javax.xml.namespace.QName;
/*    */ import javax.xml.ws.Service;
/*    */ import javax.xml.ws.WebEndpoint;
/*    */ import javax.xml.ws.WebServiceClient;
/*    */ import javax.xml.ws.WebServiceFeature;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @WebServiceClient(name = "RelationshipService", wsdlLocation = "classpath:/wsdl/cmis11/CMISWS-Service.wsdl", targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/")
/*    */ public class RelationshipService
/*    */   extends Service
/*    */ {
/*    */   public static final URL WSDL_LOCATION;
/* 23 */   public static final QName SERVICE = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "RelationshipService");
/* 24 */   public static final QName RelationshipServicePort = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "RelationshipServicePort");
/*    */   static {
/* 26 */     URL url = RelationshipService.class.getClassLoader().getResource("/wsdl/cmis11/CMISWS-Service.wsdl");
/* 27 */     if (url == null) {
/* 28 */       url = RelationshipService.class.getClassLoader().getResource("wsdl/cmis11/CMISWS-Service.wsdl");
/*    */     }
/* 30 */     if (url == null) {
/* 31 */       Logger.getLogger(RelationshipService.class.getName())
/* 32 */         .log(Level.INFO, "Can not initialize the default wsdl from {0}", "classpath:/wsdl/cmis11/CMISWS-Service.wsdl");
/*    */     }
/*    */     
/* 35 */     WSDL_LOCATION = url;
/*    */   }
/*    */   
/*    */   public RelationshipService(URL wsdlLocation) {
/* 39 */     super(wsdlLocation, SERVICE);
/*    */   }
/*    */   
/*    */   public RelationshipService(URL wsdlLocation, QName serviceName) {
/* 43 */     super(wsdlLocation, serviceName);
/*    */   }
/*    */   
/*    */   public RelationshipService() {
/* 47 */     super(WSDL_LOCATION, SERVICE);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public RelationshipService(WebServiceFeature... features) {
/* 54 */     super(WSDL_LOCATION, SERVICE, features);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public RelationshipService(URL wsdlLocation, WebServiceFeature... features) {
/* 61 */     super(wsdlLocation, SERVICE, features);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public RelationshipService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
/* 68 */     super(wsdlLocation, serviceName, features);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @WebEndpoint(name = "RelationshipServicePort")
/*    */   public RelationshipServicePort getRelationshipServicePort() {
/* 78 */     return getPort(RelationshipServicePort, RelationshipServicePort.class);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @WebEndpoint(name = "RelationshipServicePort")
/*    */   public RelationshipServicePort getRelationshipServicePort(WebServiceFeature... features) {
/* 90 */     return getPort(RelationshipServicePort, RelationshipServicePort.class, features);
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\RelationshipService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */