DESCRIPTION = "Devel::StackTrace::AsHTML adds "as_html" method to Devel::StackTrace which \
displays the stack trace in beautiful HTML, with code snippet context and \
function parameters. If you call it on an instance of \
Devel::StackTrace::WithLexicals, you even get to see the lexical variables \
of each stack frame."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-StackTrace-AsHTML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIYAGAWA/Devel-StackTrace-AsHTML-0.15.tar.gz"

SRC_URI[md5sum] = "4ec8bd92e4a765a7cabf402db9640412"
SRC_URI[sha256sum] = "6283dbe2197e2f20009cc4b449997742169cdd951bfc44cbc6e62c2a962d3147"
RDEPENDS:${PN} += "devel-stacktrace-perl"

S = "${WORKDIR}/Devel-StackTrace-AsHTML-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
