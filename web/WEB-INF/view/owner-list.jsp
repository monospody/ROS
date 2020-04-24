<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" />
        <title>Owner List</title>
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <h2>Owner List</h2>
            </div>
        </div>
        <div id="container">
            <div id="content">

                <input type="button" value="Add owner" class="add-button" onclick="window.location.href='showAddOwnerForm'; return false;"/>

                <table>
                    <tr>
                        <th>Id</th>
                        <th>Company Name</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Street</th>
                        <th>Zip Code</th>
                        <th>City</th>
                        <th>ICO</th>
                        <th>DIC</th>
                        <th>IC DPH</th>
                        <th>Password</th>
                        <th>Email</th>
                        <th>Phone</th>
                        <th>Invoice street</th>
                        <th>Invoice zip code</th>
                        <th>Invoice city</th>
                        <th>Registration Date</th>
                        <th>Action</th>
                    </tr>
                    <c:forEach var="owner" items="${owners}">

                        <c:url var="updateLink" value="/owner/showUpdateOwnerForm">
                            <c:param name="ownerId" value="${owner.ownerId}"/>
                        </c:url>
                        <c:url var="deleteLink" value="/customer/delete">
                            <c:param name="ownerId" value="${owner.ownerId}"/>
                        </c:url>

                        <tr>
                            <td>${owner.ownerId}</td>
                            <td>${owner.ownerCompanyName}</td>
                            <td>${owner.ownerFirstName}</td>
                            <td>${owner.ownerLastName}</td>
                            <td>${owner.ownerStreet}</td>
                            <td>${owner.ownerZipCode}</td>
                            <td>${owner.ownerCity}</td>
                            <td>${owner.ownerICO}</td>
                            <td>${owner.ownerDIC}</td>
                            <td>${owner.ownerIcDPH}</td>
                            <td>${owner.ownerPassword}</td>
                            <td>${owner.ownerEmail}</td>
                            <td>${owner.ownerPhoneNumber}</td>
                            <td>${owner.ownerInvoiceStreet}</td>
                            <td>${owner.ownerInvoiceZipCode}</td>
                            <td>${owner.ownerInvoiceCity}</td>
                            <td>${owner.registrationDate}</td>
                            <td>
                                <a href="${updateLink}">Update</a>
                                |
                                <a href="${deleteLink}" onclick="if (!(confirm('Are you sure you want to delete this owner ?'))) return false">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>