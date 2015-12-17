package org.openmrs.module.emrapi.diagnosis;

import org.openmrs.Encounter;
import org.openmrs.Obs;
import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;


import java.util.Date;
import java.util.List;

/**
 * <pre>
 * API methods for managing diagnoses
 * </pre>
 */
public interface DiagnosisService extends OpenmrsService {

    /**
     * Changes a non-coded diagnosis to coded diagnosis
     * @param nonCodedObs an Obs that contains the non-coded diagnosis
     * @param diagnoses a List of Diagnosis representing the new diagnoses
     * @return
     */
    List<Obs> codeNonCodedDiagnosis(Obs nonCodedObs, List<Diagnosis> diagnoses);

	/**
	 * Gets diagnoses since date, sorted in reverse chronological order
	 *
	 * @param patient
	 * @param fromDate
	 * @return the list of diagnoses
	 */
	List<Diagnosis> getDiagnoses(Patient patient, Date fromDate, Date toDate);

    /**
     * Finds the primary diagnoses for a given encounter
     * @param encounter
     * @return the list of diagnoses
     */
    List<Diagnosis> getPrimaryDiagnoses(Encounter encounter);

    /**
     * Determines whether or not an encounter contains a given diagnosis
     * @param encounter
     * @param diagnosis
     * @return a boolean
     */
    boolean  hasDiagnosis(Encounter encounter, Diagnosis diagnosis);

	/**
	 * Gets unique diagnoses since date, sorted in reverse chronological order
	 *
	 * @param patient
	 * @param fromDate
	 * @return the list of diagnoses
	 */
	List<Diagnosis> getUniqueDiagnoses(Patient patient, Date fromDate, Date toDate);
}
