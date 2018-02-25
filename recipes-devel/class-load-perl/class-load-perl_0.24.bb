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

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Class-Load-0.24.tar.gz"

SRC_URI[md5sum] = "daf8aeedf4d19ed6d3f75cd3e720116d"
SRC_URI[sha256sum] = "0bb983da46c146534fc77a556d6e40d925142f2eb43103534025ee545265ca36"
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
