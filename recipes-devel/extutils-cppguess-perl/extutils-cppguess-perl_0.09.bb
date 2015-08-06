DESCRIPTION = ""ExtUtils::CppGuess\" attempts to guess the system's C++ compiler that \
is compatible with the C compiler that your perl was built with."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-CppGuess"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETJ/ExtUtils-CppGuess-0.09.tar.gz"

SRC_URI[md5sum] = "f8ada38ee4ad86a4f1e20d8525ce0c99"
SRC_URI[sha256sum] = "48625195a88c0f2ddc37bbd7a06346aa68ffb6948ba78da3aea47c0db2540f65"
RDEPENDS_${PV} += "extutils-makemaker-perl"
RDEPENDS_${PV} += "module-build-perl"

S = "${WORKDIR}/ExtUtils-CppGuess-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
