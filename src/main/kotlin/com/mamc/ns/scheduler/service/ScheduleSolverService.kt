package com.mamc.ns.scheduler.service

import com.mamc.ns.scheduler.domain.Schedule
import org.optaplanner.core.api.solver.SolverFactory

class ScheduleSolverService {

	fun solveProblem(): Schedule {
		
		var solverFactory: SolverFactory<Schedule> = SolverFactory.createFromXmlResource(
				"com/mamc/ns/scheduler/service/scheduleSolverConfig.xml")
		
		var solver = solverFactory.buildSolver()

		// Solve the problem
		var solvedCloudBalance = solver.solve(Schedule())

		// Display the result
		return solvedCloudBalance;
	}
}