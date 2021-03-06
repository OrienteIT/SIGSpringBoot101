/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.11).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.dronebuzzers.parts.service.api;

import com.dronebuzzers.parts.service.model.Part;
import com.dronebuzzers.parts.service.model.Parts;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-14T21:15:28.475Z")

@Api(value = "part", description = "the part API")
public interface PartApi {

    PartApiDelegate getDelegate();

    @ApiOperation(value = "get part details", nickname = "getPart", notes = "", response = Part.class, tags={ "parts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Part.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/part/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<Part> getPart(@ApiParam(value = "part id",required=true) @PathVariable("id") String id) {
        return getDelegate().getPart(id);
    }


    @ApiOperation(value = "get parts", nickname = "getParts", notes = "", response = Parts.class, tags={ "parts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Parts.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/part",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Parts> getParts() {
        return getDelegate().getParts();
    }


    @ApiOperation(value = "get parts by category", nickname = "getPartsByCategory", notes = "", response = Parts.class, tags={ "parts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Parts.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/part/category/{category}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<Parts> getPartsByCategory(@ApiParam(value = "category id",required=true) @PathVariable("category") String category) {
        return getDelegate().getPartsByCategory(category);
    }


    @ApiOperation(value = "get parts by type", nickname = "getPartsByType", notes = "", response = Parts.class, tags={ "parts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Parts.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/part/type/{type}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<Parts> getPartsByType(@ApiParam(value = "type id",required=true) @PathVariable("type") String type) {
        return getDelegate().getPartsByType(type);
    }

}
