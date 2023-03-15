DESCRIPTION = "Skip test scripts if modules are not available. The requested modules will \
be loaded, and optionally have their versions checked. If the module is \
missing, the test script will be skipped. Modules that are found but fail \
to compile will exit with an error rather than skip."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Needs"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Test-Needs-0.002009.tar.gz"

SRC_URI[md5sum] = "5643cd323afb77d20363acbaf9b12bcc"
SRC_URI[sha256sum] = "571c21193ad16195df58b06b268798796a391b398c443271721d2cc0fb7c4ac3"

S = "${WORKDIR}/Test-Needs-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
