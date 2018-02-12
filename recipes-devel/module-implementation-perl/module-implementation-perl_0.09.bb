DESCRIPTION = "This module abstracts out the process of choosing one of several underlying \
implementations for a module. This can be used to provide XS and pure Perl \
implementations of a module, or it could be used to load an implementation \
for a given OS or any other case of needing to provide multiple \
implementations."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Module-Implementation"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Module-Implementation-0.09.tar.gz"

SRC_URI[md5sum] = "52e3fe0ca6b1eff0488d59b7aacc0667"
SRC_URI[sha256sum] = "c15f1a12f0c2130c9efff3c2e1afe5887b08ccd033bd132186d1e7d5087fd66d"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Module-Implementation-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
