package com.mamc.ns.scheduler.domain

import com.mamc.ns.scheduler.enums.ShiftType
import org.optaplanner.core.api.domain.entity.PlanningEntity
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty
import org.optaplanner.core.api.domain.solution.PlanningScore
import org.optaplanner.core.api.domain.solution.PlanningSolution
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider
import org.optaplanner.core.api.domain.variable.PlanningVariable
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore
import java.util.Date


class Shift {
	lateinit var shiftDate: Date
	lateinit var shiftType: ShiftType
}

@PlanningEntity()
class Employee {
	lateinit var lastName: String
	lateinit var firstName: String

	@PlanningVariable(valueRangeProviderRefs = arrayOf("shiftRange"))
	lateinit var shift: Shift
}

@PlanningSolution
class Schedule {

	@ValueRangeProvider(id = "shiftRange")
	@ProblemFactCollectionProperty
	lateinit var shifts: List<Shift>

	@PlanningEntityCollectionProperty
	lateinit var employees: List<Employee>

	@PlanningScore
	lateinit var score: HardSoftScore

}
