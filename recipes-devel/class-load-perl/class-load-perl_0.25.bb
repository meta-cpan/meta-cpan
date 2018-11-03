DESCRIPTION = ""require EXPR" only accepts "Class/Name.pm" style module names, not \
"Class::Name". How frustrating! For that, we provide "load_class \
'Class::Name'"."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Load"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Class-Load-0.25.tar.gz"

SRC_URI[md5sum] = "e4c831c08df592ce8dfee0c7cfc12fd7"
SRC_URI[sha256sum] = "2a48fa779b5297e56156380e8b32637c6c58decb4f4a7f3c7350523e11275f8f"
RDEPENDS_${PN} += "data-optlist-perl"
RDEPENDS_${PN} += "module-implementation-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "package-stash-perl"
RDEPENDS_${PN} += "try-tiny-perl"
RRECOMMEND_${PN} += "class-load-xs-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-needs-perl-native"

S = "${WORKDIR}/Class-Load-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
