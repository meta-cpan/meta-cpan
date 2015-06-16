DESCRIPTION = "Moose is an extension of the Perl 5 object system."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Moose"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Moose-2.1405.tar.gz"

SRC_URI[md5sum] = "d24b8609a8aab95cce4b25162a2e2da2"
SRC_URI[sha256sum] = "c2cb820cc71cb80ed3bb69b3e52cb57b19b160d42c86b782521e56c14635305a"
RDEPENDS_${PN} += "class-load-perl"
RDEPENDS_${PN} += "class-load-xs-perl"
RDEPENDS_${PN} += "data-optlist-perl"
RDEPENDS_${PN} += "devel-globaldestruction-perl"
RDEPENDS_${PN} += "devel-overloadinfo-perl"
RDEPENDS_${PN} += "devel-stacktrace-perl"
RDEPENDS_${PN} += "dist-checkconflicts-perl"
RDEPENDS_${PN} += "eval-closure-perl"
RDEPENDS_${PN} += "list-moreutils-perl"
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
RDEPENDS_${PN} += "task-weaken-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "cpan-meta-check-perl-native"
DEPENDS += "test-cleannamespaces-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"
DEPENDS += "test-warnings-perl-native"

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
