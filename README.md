# apache/cmis

## apache/cmis最佳实践

官方参考资料:

https://chemistry.apache.org/

https://chemistry.apache.org/docs/cmis-samples/



## SAP实践

https://help.sap.com/docs/SAP_Document_Center/c5bc243e9e824373a5e8de7c37b1dee1/1a236bb656f443a4a34047ecefa95539.html?locale=en-US

| Service              | CMIS Method                  | ABAP Method          | Convenience Implementation in Abstract Class | Required (ro = read-only, rw = read-write)                   |
| :------------------- | :--------------------------- | :------------------- | :------------------------------------------- | :----------------------------------------------------------- |
| Service              | CMIS Method                  | ABAP Method          | Convenience Implementation in Abstract Class | Required (ro = read-only, rw = read-write)                   |
| Repository Service   |                              |                      |                                              |                                                              |
|                      | getRepositories              |                      | X                                            | ro / rw                                                      |
|                      | getRepositoryInfo            | REP_INFO             | -                                            | ro / rw                                                      |
|                      | getTypeChildren              | GET_TYPE_CHILDREN    | -                                            | ro / rw                                                      |
|                      | getTypeDecendants            | GET_TYPE_DESCENDANTS | X                                            | ro / rw                                                      |
|                      | getTypeDefinition            | GET_ TYPE_DEFINITION | -                                            | ro / rw                                                      |
|                      | createType                   |                      | -                                            | -                                                            |
|                      | updateType                   |                      | -                                            | -                                                            |
|                      | deleteType                   |                      | -                                            | -                                                            |
| Navigation Service   |                              |                      |                                              |                                                              |
|                      | getChildren                  | GET_CHILDREN         | -                                            | ro / rw                                                      |
|                      | getDecendants                |                      | X                                            | -                                                            |
|                      | getFolderTree                |                      | X                                            | -                                                            |
|                      | getFolderParent              |                      | -                                            | ro / rw                                                      |
|                      | getObjectParents             | GET_OBJECT_PARENTS   | -                                            | ro / rw                                                      |
|                      | getCheckedOutDocs            |                      | -                                            | -                                                            |
| Object Service       |                              |                      |                                              |                                                              |
|                      | createDocument               |                      | -                                            | rw                                                           |
|                      | createDocumentFromSource     |                      | -                                            | rw                                                           |
|                      | createFolder                 |                      | -                                            | rw                                                           |
|                      | createRelationship           |                      | -                                            | -                                                            |
|                      | createPolicy                 |                      | -                                            | -                                                            |
|                      | createItem                   |                      | -                                            | -                                                            |
|                      | getObject                    | GET_OBJECT           | -                                            | ro / rw                                                      |
|                      | getAllowableActions          |                      | X                                            | ro / rw                                                      |
|                      | getProperties                |                      | X                                            | ro / rw                                                      |
|                      | getObjectByPath              |                      | -                                            | ro / rw                                                      |
|                      | getContentStream             | GET_CONTENT          | -                                            | ro / rw                                                      |
|                      | getRenditions                |                      | X                                            | -                                                            |
|                      | updateProperties             |                      | -                                            | rw                                                           |
|                      | bulkUpdateProperties         |                      | X                                            | -                                                            |
|                      | moveObject                   |                      | -                                            | ro / rw                                                      |
|                      | deleteObject                 |                      | -                                            | ro / rw                                                      |
|                      | deleteTree                   |                      | -                                            | ro / rw                                                      |
|                      | setContentStream             |                      | -                                            | ro / rw                                                      |
|                      | appendContentStream          |                      | -                                            | -                                                            |
|                      | deleteContentStream          |                      | -                                            | ro / rw                                                      |
| Versioning Service   |                              |                      |                                              |                                                              |
|                      | checkOut                     |                      | -                                            | rw                                                           |
|                      | cancelCheckOut               |                      | -                                            | rw                                                           |
|                      | checkIn                      |                      | -                                            | rw                                                           |
|                      | getObjectOfLatestVersion     |                      | -                                            | ro / rw                                                      |
|                      | getPropertiesOfLatestVersion |                      | X                                            | -                                                            |
|                      | getAllVersions               |                      | -                                            | rw                                                           |
| Discovery Service    |                              |                      |                                              |                                                              |
|                      | query                        | QUERY                | -                                            | ro / rw(metadata query is required, fulltext query is optional) |
|                      | getContentChanges            |                      | -                                            | -(used if available)                                         |
| ACL Service          |                              |                      |                                              |                                                              |
|                      | getACL                       |                      | -                                            | -                                                            |
|                      | applyACL                     |                      | -                                            | -                                                            |
| Relationship Service |                              |                      |                                              |                                                              |
|                      | getObjectRelationships       |                      | -                                            | -                                                            |
| Policy Service       |                              |                      | -                                            | -                                                            |
|                      | applyPolicy                  |                      | -                                            | -                                                            |
|                      | removePolicy                 |                      | -                                            | -                                                            |
|                      | getAppliedPolicies           |                      |                                              |                                                              |
| Multifiling Service  |                              |                      |                                              |                                                              |
|                      | addObjectToFolder            |                      | -                                            | -                                                            |
|                      | removeObjectFromFolder       |                      | -                                            | -                                                            |



## 实践文档

请阅读

CMIS.Apache.Chemistry.in.Action-by jettjia.docx



# sap/archiveLink

官方协议地址:

https://help.sap.com/saphelp_nw73/helpdata/en/4d/06fb6f43e05dc6e10000000a42189c/frameset.htm



主要针对 sap op系统的存储接口



