package de.jotomo.ruffyscripter.commands;

public class ConfirmAlertCommand extends BaseCommand {
    private final int warningCode;

    public ConfirmAlertCommand(int warningCode) {
        this.warningCode = warningCode;
    }

    @Override
    public void execute() {
        result.success(scripter.confirmAlert(warningCode, 5000));
    }
}