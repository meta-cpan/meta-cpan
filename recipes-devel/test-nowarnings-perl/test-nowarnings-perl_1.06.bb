DESCRIPTION = "In general, your tests shouldn't produce warnings. This modules causes any \
warnings to be captured and stored. It automatically adds an extra test \
that will run when your script ends to check that there were no warnings. \
If there were any warnings, the test will give a "not ok" and diagnostics \
of where, when and what the warning was, including a stack trace of what \
was going on when the it occurred."

SECTION = "libs"
LICENSE = "LGPL-2.1-only"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-NoWarnings"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.1-only;md5=1a6d268fd218675ffea8be556788b780"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Test-NoWarnings-1.06.tar.gz"

SRC_URI[md5sum] = "e44d8b1820b45a71e59a0119120ca622"
SRC_URI[sha256sum] = "c2dc51143b7eb63231210e27df20d2c8393772e0a333547ec8b7a205ed62f737"

S = "${WORKDIR}/Test-NoWarnings-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
