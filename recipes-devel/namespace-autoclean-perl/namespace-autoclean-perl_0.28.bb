DESCRIPTION = "When you import a function into a Perl package, it will naturally also \
be available as a method."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/namespace-autoclean"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/namespace-autoclean-0.28.tar.gz"

SRC_URI[md5sum] = "9746a73c34f294d663c583f857b8648f"
SRC_URI[sha256sum] = "cd410a1681add521a28805da2e138d44f0d542407b50999252a147e553c26c39"
RDEPENDS_${PN} += "b-hooks-endofscope-perl"
RDEPENDS_${PN} += "namespace-clean-perl"
RDEPENDS_${PN} += "sub-identify-perl"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/namespace-autoclean-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
