DESCRIPTION = "Moose is an extension of the Perl 5 object system."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Moose"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Moose-2.2010.tar.gz"

SRC_URI[md5sum] = "636238ac384818ee1e92eff6b9ecc50a"
SRC_URI[sha256sum] = "af0905b69f18c27de1177c9bc7778ee495d4ec91be1f223e8ca8333af4de08c5"
RDEPENDS_${PN} += "class-load-perl"
RDEPENDS_${PN} += "class-load-xs-perl"
RDEPENDS_${PN} += "data-optlist-perl"
RDEPENDS_${PN} += "devel-globaldestruction-perl"
RDEPENDS_${PN} += "devel-overloadinfo-perl"
RDEPENDS_${PN} += "devel-stacktrace-perl"
RDEPENDS_${PN} += "dist-checkconflicts-perl"
RDEPENDS_${PN} += "eval-closure-perl"
RDEPENDS_${PN} += "module-runtime-conflicts-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "mro-compat-perl"
RDEPENDS_${PN} += "package-deprecationmanager-perl"
RDEPENDS_${PN} += "package-stash-perl"
RDEPENDS_${PN} += "package-stash-xs-perl"
RDEPENDS_${PN} += "params-util-perl"
RDEPENDS_${PN} += "sub-exporter-perl"
RDEPENDS_${PN} += "sub-identify-perl"
RDEPENDS_${PN} += "sub-name-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "cpan-meta-check-perl-native"
DEPENDS += "test-cleannamespaces-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Moose-${PV}"

inherit cpan

do_configure() {
        export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	export LD="${CCLD}"
        cpan_do_configure
}

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	export LD="${CCLD}"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
