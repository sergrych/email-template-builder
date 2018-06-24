package io.rocketbase.commons.email.template;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class FooterLine implements TemplateLine {

    private final String text;
    private final boolean asHtml;

    @Override
    public TemplateLineType getType() {
        return TemplateLineType.FOOTER;
    }

    public String getEscapedText() {
        if (asHtml) {
            return text.replaceAll("\\<[^>]*>", "");
        } else {
            return text;
        }
    }
}