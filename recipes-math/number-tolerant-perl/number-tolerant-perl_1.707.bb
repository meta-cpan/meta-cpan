DESCRIPTION = "Number::Tolerant creates a number-like object whose value refers to a \
range of possible values, each equally acceptable. It overloads comparison \
operations to reflect this."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Number-Tolerant"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Number-Tolerant-1.707.tar.gz"

SRC_URI[md5sum] = "5246209a3c7c36bb767d2cc7be163351"
SRC_URI[sha256sum] = "a154a328817c70e34747cd12e169ab5df0e326b50dc96fe7f264af1bb4e074c3"
RDEPENDS_${PN} += "sub-exporter-perl"
DEPENDS += "test-simple-perl-native"

S = "${WORKDIR}/Number-Tolerant-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
