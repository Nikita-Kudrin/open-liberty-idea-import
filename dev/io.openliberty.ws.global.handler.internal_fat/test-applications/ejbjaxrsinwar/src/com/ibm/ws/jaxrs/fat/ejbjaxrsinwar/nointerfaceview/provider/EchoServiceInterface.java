/*******************************************************************************
 * Copyright (c) 2021 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package com.ibm.ws.jaxrs.fat.ejbjaxrsinwar.nointerfaceview.provider;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-b05-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EchoServiceInterface", targetNamespace = "http://nointerfaceview.ejbjaxrsinwar.fat.jaxrs.ws.ibm.com/provider")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
             ObjectFactory.class
})
public interface EchoServiceInterface {

    /**
     * 
     * @param parameters
     * @return
     *         returns com.ibm.ws.jaxrs.fat.ejbjaxrsinwar.nointerfaceview.provider.EchoStringResponse
     */
    @WebMethod(action = "echoString")
    @WebResult(name = "echoStringResponse", targetNamespace = "http://nointerfaceview.ejbjaxrsinwar.fat.jaxrs.ws.ibm.com/provider", partName = "parameters")
    public EchoStringResponse invoke(
                                     @WebParam(name = "echoString", targetNamespace = "http://nointerfaceview.ejbjaxrsinwar.fat.jaxrs.ws.ibm.com/provider",
                                               partName = "parameters") EchoString parameters);

}