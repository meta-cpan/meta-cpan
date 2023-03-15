DESCRIPTION = ""require EXPR" only accepts "Class/Name.pm" style module names, not \
"Class::Name". How frustrating! For that, we provide "load_class \
'Class::Name'"."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Load"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Class-Load-0.25.tar.gz"

SRC_URI[md5sum] = "e4c831c08df592ce8dfee0c7cfc12fd7"
SRC_URI[sha256sum] = "2a48fa779b5297e56156380e8b32637c6c58decb4f4a7f3c7350523e11275f8f"
RDEPENDS:${PN} += "data-optlist-perl"
RDEPENDS:${PN} += "module-implementation-perl"
RDEPENDS:${PN} += "module-runtime-perl"
RDEPENDS:${PN} += "package-stash-perl"
RDEPENDS:${PN} += "try-tiny-perl"
DEPENDS += "test-needs-perl-native"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Class-Load-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
