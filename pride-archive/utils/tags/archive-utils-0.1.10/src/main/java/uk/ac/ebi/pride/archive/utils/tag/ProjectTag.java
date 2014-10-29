package uk.ac.ebi.pride.archive.utils.tag;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * A collection of project tags
 *
 *
 * @author Rui Wang
 * @version $Id$
 */
public enum ProjectTag {
    HUMAN_PROTEOME_PROJECT ("Human Proteome Project", "HPP", ProjectTagType.PARENT_PROJECT),
    BD_HUMAN_PROTEOME_PROJECT ("Biology/Disease-Driven Human Proteome Project (B/D-HPP)", "B/D-HPP", ProjectTagType.PARENT_PROJECT),
    C_HUMAN_PROTEOME_PROJECT ("Chromosome-centric Human Proteome Project (C-HPP)", "C-HPP", ProjectTagType.PARENT_PROJECT),
    BILS_PROJECT ("Bioinformatics Infrastructure for Life Sciences (BILS) network (Sweden)", "BILS", ProjectTagType.PARENT_PROJECT),
    PRIME_XS_PROJECT ("PRIME-XS Project", "PRIME-XS", ProjectTagType.PARENT_PROJECT),
    CPTAC_CONSORTIUM ("CPTAC Consortium", "CPTAC", ProjectTagType.PARENT_PROJECT),
    BIOLOGICAL ("Biological", "Biological", ProjectTagType.PRIDE_INTERNAL),
    BIOMEDICAL ("Biomedical", "Biomedical", ProjectTagType.PRIDE_INTERNAL),
    TECHNICAL ("Technical", "Technical", ProjectTagType.PRIDE_INTERNAL),
    CARDIOVASCULAR ("Cardiovascular", "Cardiovascular", ProjectTagType.PRIDE_INTERNAL),
    METAPROTEMOICS ("Metaproteomics", "Metaproteomics", ProjectTagType.PRIDE_INTERNAL),
    HIGHLIGHTED ("Highlighted", "Highlighted", ProjectTagType.PRIDE_HIGHLIGHTED);

    private String name;
    private String shortName;
    private ProjectTagType type;

    ProjectTag(String name, String shortName, ProjectTagType type) {
        this.name = name;
        this.shortName = shortName;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public ProjectTagType getType() {
        return type;
    }

    public static Collection<String> getProjectTagNames() {
        ArrayList<String> projectTags = new ArrayList<String>();

        for (ProjectTag tag : values()) {
            projectTags.add(tag.getName());
        }

        return projectTags;
    }

    public static Collection<String> getProjectTagShortNames() {
        ArrayList<String> projectTags = new ArrayList<String>();

        for (ProjectTag tag : values()) {
            projectTags.add(tag.getShortName());
        }

        return projectTags;
    }

    public static ProjectTag getProjectTagByName(String name) {
        for (ProjectTag projectTag : ProjectTag.values()) {
            if (projectTag.getName().equalsIgnoreCase(name)) {
                return projectTag;
            }
        }

        return null;
    }

    public static ProjectTag getProjectTagByShortName(String name) {
        for (ProjectTag projectTag : ProjectTag.values()) {
            if (projectTag.getShortName().equalsIgnoreCase(name)) {
                return projectTag;
            }
        }

        return null;
    }

    public static Collection<ProjectTag> getProjectTagsByType(ProjectTagType type) {
        Collection<ProjectTag> typedProjectTags = new LinkedHashSet<ProjectTag>();

        for (ProjectTag projectTag : ProjectTag.values()) {
            if (projectTag.getType().equals(type)) {
                typedProjectTags.add(projectTag);
            }
        }

        return typedProjectTags;
    }
}
