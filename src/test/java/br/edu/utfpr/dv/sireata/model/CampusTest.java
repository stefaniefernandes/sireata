/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dv.sireata.model;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author Stefanie
 */
public class CampusTest extends TestCase {
    


    @Test
    public void testNome() {
        Campus campus = new Campus();
        campus.setNome("Campus Cornélio Procópio");
        assertEquals("Campus Cornélio Procópio", campus.getNome());
    }

   
    @Test
    public void testSite() {
        final String site_ = "http://www.utfpr.edu.br";
        Campus campus = new Campus();
        campus.setSite(site_);
        assertEquals(site_, campus.getSite());
    }

    
}
