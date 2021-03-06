---
layout: page
title: User Guide
---

Calo is a **desktop app that is designed for keeping track of calories burnt throughout the day. It is optimized for use via a Command Line Interface (CLI)** while still having Graphical User Interface (GUI). If you are a skilled typer, you can carry out various tasks such as adding new exercises and checking records for previous days much faster than the traditional GUI apps.

- Table of Contents
  {:toc}

---

## Quick start

1. Ensure you have Java `11` or above installed in your Computer.

2. Download the latest `Calo.jar`.

3. Copy the file to the folder you want to use as the _home folder_ for your Calo.

4. Double-click the file to start the app. The GUI similar to the below should appear in a few seconds. Note how the app contains some sample data.

5. Type the command in the command box and press Enter to execute it. For the details of each command, refer to the Features below.

---

## Features

<div markdown="block" class="alert alert-info">

**:information_source: Notes about the command format:**<br>

- Words in `UPPER_CASE` are the parameters to be supplied by the user.<br>
  e.g. in `add n/NAME`, `NAME` is a parameter which can be used as `add n/John Doe`.

- Items in square brackets are optional.<br>
  e.g `n/NAME [t/TAG]` can be used as `n/John Doe t/friend` or as `n/John Doe`.

- Items with `…`​ after them can be used multiple times including zero times.<br>
  e.g. `[t/TAG]…​` can be used as ` ` (i.e. 0 times), `t/friend`, `t/friend t/family` etc.

- Parameters can be in any order.<br>
  e.g. if the command specifies `n/NAME p/PHONE_NUMBER`, `p/PHONE_NUMBER n/NAME` is also acceptable.

</div>

### Update exercises : `update`

Update an existing exercise.

Format: `update INDEX [e/EXERCISE] [d/DESCRIPTION] [at/DATE] [c/CALORIES​`

- Edits the workout at the specified `INDEX`. The index refers to the index number shown in the displayed workout list. The index **must be a positive integer** 1, 2, 3, …​
- Existing values will be updated to the input values.

Examples:

- `update 1 e/Push up d/30 at/09-07-2020 c/260` Updates the exercise, the description, the date and the calories burnt of the 1st exercise to be `push up`, `30`,  `07-09-2020`, `260` respectively.
---

## FAQ

**Q**: How do I transfer my data to another Computer?<br>
**A**: Transfer the file “data” that is contained in the same file as your .jar file from your old computer to your new computer.

**Q**: How to load my archived file?<br>
**A**: For now, you can delete the `entry.txt` file in the `data` folder and rename the archived file of your choices to `entry.txt`. In subsequent updates, we will introduce a command to load archived files via Command Line Interface.

---

## Command summary

| Action     | Format, Examples                                                                                                                                                      |
| ---------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Add**    | `add e/EXERCISE d/DESCRIPTION at/DATE [c/CALORIES]` <br> e.g. `add e/Push up d/10 at/14-09-2020 c/30` |
| **Delete** | `delete INDEX`<br> e.g., `delete 2`                                                                                                                                   |
| **Update**   | `update INDEX [e/EXERCISE] [d/DESCRIPTION] [at/DATE] [c/CALORIES]​`<br> e.g.,`update 1 e/Push up d/30 at/09-07-2020 c/260`                                           |
| **Find**   | `find KEYWORD [MORE_KEYWORDS]`<br> e.g., `find James Jake`                                                                                                            |
| **List**   | `list`                                                                                                                                                                |
| **Archive**   | `Archive FILE_LOCATION`    <br> e.g.,`archive data\file_name.txt`                                                                                                                                                                    |
