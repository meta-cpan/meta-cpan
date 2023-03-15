DESCRIPTION = "Moose is an extension of the Perl 5 object system."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Moose"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Moose-2.2201.tar.gz"

SRC_URI[md5sum] = "5ff10f1fcefc47ee8340375fb67b42a2"
SRC_URI[sha256sum] = "cd5ff9b4751f73ecb6874ba9761343d35737d4ddf5ff6b19c00d01af5ffc3eb2"
RDEPENDS:${PN} += "class-load-perl"
RDEPENDS:${PN} += "class-load-xs-perl"
RDEPENDS:${PN} += "data-optlist-perl"
RDEPENDS:${PN} += "devel-globaldestruction-perl"
RDEPENDS:${PN} += "devel-overloadinfo-perl"
RDEPENDS:${PN} += "devel-stacktrace-perl"
RDEPENDS:${PN} += "dist-checkconflicts-perl"
RDEPENDS:${PN} += "eval-closure-perl"
RDEPENDS:${PN} += "module-runtime-conflicts-perl"
RDEPENDS:${PN} += "module-runtime-perl"
RDEPENDS:${PN} += "mro-compat-perl"
RDEPENDS:${PN} += "package-deprecationmanager-perl"
RDEPENDS:${PN} += "package-stash-perl"
RDEPENDS:${PN} += "package-stash-xs-perl"
RDEPENDS:${PN} += "params-util-perl"
RDEPENDS:${PN} += "scalar-list-utils-perl"
RDEPENDS:${PN} += "sub-exporter-perl"
RDEPENDS:${PN} += "try-tiny-perl"
DEPENDS += "cpan-meta-check-perl-native"
DEPENDS += "test-cleannamespaces-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Moose-${PV}"

inherit cpan

do_configure() {
	export LD="${CCLD}"
	cpan_do_configure
}

do_compile() {
	export LD="${CCLD}"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
