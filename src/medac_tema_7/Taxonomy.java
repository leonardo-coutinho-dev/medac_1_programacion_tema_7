/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medac_tema_7;

/**
 *
 * @author Leonardo Coutinho dos Santos
 *
 */
public final class Taxonomy {

    // Attributes
    private String domain;
    private String kingdom;
    private String phylum;
    private String taxClass;
    private String order;
    private String family;
    private String genus;
    private String species;
    private String subspecies;

    // Constructor - default 
    public Taxonomy() {
        domain = null;
        kingdom = null;
        phylum = null;
        taxClass = null;
        order = null;
        family = null;
        genus = null;
        species = null;
        subspecies = null;
    }

    // Constructor
    public Taxonomy(
            String domain,
            String kingdom,
            String phylum,
            String taxClass,
            String order,
            String family,
            String genus,
            String species,
            String subspecies
    ) {
        this.domain = domain;
        this.kingdom = kingdom;
        this.phylum = phylum;
        this.taxClass = taxClass;
        this.order = order;
        this.family = family;
        this.genus = genus;
        this.species = species;
        this.subspecies = subspecies;
    }

    // Getters
    public String getDomain() {
        return domain;
    }

    public String getKingdom() {
        return kingdom;
    }

    public String getPhylum() {
        return phylum;
    }

    public String getTaxClass() {
        return taxClass;
    }

    public String getOrder() {
        return order;
    }

    public String getFamily() {
        return family;
    }

    public String getGenus() {
        return genus;
    }

    public String getSpecies() {
        return species;
    }

    public String getSubspecies() {
        return subspecies;
    }

    // Setters
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

}
