# Target: make new pr=ExerciseName
new:
	@if [ "$(pr)" = "" ]; then \
		echo "Empty exercise file not found!"; \
		exit 1; \
	fi
	@mkdir -p $(pr)
	@echo "public class $(pr) {" > $(pr)/$(pr).java
	@echo "	// your code here" >> $(pr)/$(pr).java
	@echo "}" >> $(pr)/$(pr).java
	@echo "Created new exercise: $(pr)/$(pr).java"

clean:
	@rm -f build/*

# Target: make run pr=ExerciseName
run: clean
	@if [ ! -f $(pr)/$(pr).java ]; then \
		echo "Exercise file '$(pr)/$(pr).java' not found!"; \
		exit 1; \
	fi
	@mkdir -p build
	@javac $(pr)/*.java ExerciseRunner.java -d build
	@java -cp build ExerciseRunner