DESCRIPTION = ""ExtUtils::CppGuess\" attempts to guess the system's C++ compiler that \
is compatible with the C compiler that your perl was built with."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-CppGuess"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAVIDO/ExtUtils-CppGuess-0.11.tar.gz"

SRC_URI[md5sum] = "799715985e7257dc07cc42a9402170d7"
SRC_URI[sha256sum] = "c70ce0d29476d76d9dea310850a270721e312eb79eb9bfd0a842c510b2855273"
RDEPENDS_${PN} += "capture-tiny-perl"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/ExtUtils-CppGuess-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
