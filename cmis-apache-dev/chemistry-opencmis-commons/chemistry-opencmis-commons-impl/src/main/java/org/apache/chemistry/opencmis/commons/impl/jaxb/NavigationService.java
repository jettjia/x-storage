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
/*    */ @WebServiceClient(name = "NavigationService", wsdlLocation = "classpath:/wsdl/cmis11/CMISWS-Service.wsdl", targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/")
/*    */ public class NavigationService
/*    */   extends Service
/*    */ {
/*    */   public static final URL WSDL_LOCATION;
/* 23 */   public static final QName SERVICE = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "NavigationService");
/* 24 */   public static final QName NavigationServicePort = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "NavigationServicePort");
/*    */   static {
/* 26 */     URL url = NavigationService.class.getClassLoader().getResource("/wsdl/cmis11/CMISWS-Service.wsdl");
/* 27 */     if (url == null) {
/* 28 */       url = NavigationService.class.getClassLoader().getResource("wsdl/cmis11/CMISWS-Service.wsdl");
/*    */     }
/* 30 */     if (url == null) {
/* 31 */       Logger.getLogger(NavigationService.class.getName())
/* 32 */         .log(Level.INFO, "Can not initialize the default wsdl from {0}", "classpath:/wsdl/cmis11/CMISWS-Service.wsdl");
/*    */     }
/*    */     
/* 35 */     WSDL_LOCATION = url;
/*    */   }
/*    */   
/*    */   public NavigationService(URL wsdlLocation) {
/* 39 */     super(wsdlLocation, SERVICE);
/*    */   }
/*    */   
/*    */   public NavigationService(URL wsdlLocation, QName serviceName) {
/* 43 */     super(wsdlLocation, serviceName);
/*    */   }
/*    */   
/*    */   public NavigationService() {
/* 47 */     super(WSDL_LOCATION, SERVICE);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public NavigationService(WebServiceFeature... features) {
/* 54 */     super(WSDL_LOCATION, SERVICE, features);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public NavigationService(URL wsdlLocation, WebServiceFeature... features) {
/* 61 */     super(wsdlLocation, SERVICE, features);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public NavigationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
/* 68 */     super(wsdlLocation, serviceName, features);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @WebEndpoint(name = "NavigationServicePort")
/*    */   public NavigationServicePort getNavigationServicePort() {
/* 78 */     return getPort(NavigationServicePort, NavigationServicePort.class);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @WebEndpoint(name = "NavigationServicePort")
/*    */   public NavigationServicePort getNavigationServicePort(WebServiceFeature... features) {
/* 90 */     return getPort(NavigationServicePort, NavigationServicePort.class, features);
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\NavigationService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */